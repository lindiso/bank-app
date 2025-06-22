package com.bank.services;

import com.bank.dto.AccountDto;
import com.bank.model.Account;
import com.bank.repository.AccountsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Component
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Autowired
    private MessageSender messageSender;

    @Override
    public String withdraw(Long accountId, BigDecimal amount) {
        if (accountId == null){
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount cannot be null or less than 0");
        }
        //first get current balance
        BigDecimal currentBalance = accountsRepository.findCurrentBalance(accountId);
        if (currentBalance != null && currentBalance.compareTo(BigDecimal.ZERO) > 0) {
            int affectedRow = accountsRepository.withdraw(accountId, amount);
            if (affectedRow > 0){
                AccountDto accountDto = findAccount(accountId);
                messageSender.publishMessage(accountDto.toJson());
                return "Withdrawal successful";
            }
            return "Withdrawal failed";
        }
        // Insufficient funds
        return "Insufficient funds for withdrawal";
    }

    @Override
    @Transactional
    public String createAccount(Long accountId, BigDecimal amount) {
        if (accountId == null){
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        Account existingAccount = accountsRepository.findByAccountId(accountId);
        if(existingAccount != null){
            throw new IllegalArgumentException("Account already exists");
        }
        Account account = new Account();
        account.setAccountId(accountId);
        account.setAmount(amount);
        account.setStatus("ACTIVE");
        Account response = accountsRepository.save(account);
        if (response.getId() == 0) {
            throw new IllegalArgumentException("Account creation failed");
        }

        return "Account created successfully";
    }

    @Override
    public AccountDto findAccount(Long accountId) {
        Account account = accountsRepository.findByAccountId(accountId);
        log.info("Found account with id " + accountId);
        if (account != null){
            AccountDto dto = new AccountDto();
            dto.setAccountId(accountId);
            dto.setAmount(account.getAmount());
            dto.setStatus(account.getStatus());
            return dto;
        }
        return null;
    }

    @Override
    @Transactional
    public String deposit(Long accountId, BigDecimal amount) {
        if (accountId == null){
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        Account account = accountsRepository.findByAccountId(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        int affectedRow = accountsRepository.deposit(accountId, amount);
        if (affectedRow > 0){
            return "Deposit successful";
        }
        return "Deposit failed";
    }
}
