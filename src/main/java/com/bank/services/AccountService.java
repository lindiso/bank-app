package com.bank.services;

import com.bank.dto.AccountDto;
import com.bank.model.Account;

import java.math.BigDecimal;

public interface AccountService {
    String withdraw(Long accountId, BigDecimal amount);

    String deposit(Long accountId, BigDecimal amount);

    String createAccount(Long accountId, BigDecimal amount);

    AccountDto findAccount(Long accountId);

}
