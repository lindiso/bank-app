package com.bank.mock;

import com.bank.model.Account;
import com.bank.repository.AccountsRepository;
import com.bank.services.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class BankAppMockTest {

    @Mock
    private AccountsRepository accountsRepository;

    @InjectMocks
    private AccountServiceImpl accountService;

    @Test
    public void createAccountTest()  {
        Account account = new Account();
        account.setId(1);
        account.setAccountId(123L);
        account.setAmount(BigDecimal.valueOf(200));
        account.setStatus("ACTIVE");
        Mockito.when(accountsRepository.save(Mockito.any(Account.class))).thenReturn(account);
        String mockResult = accountService.createAccount(123L, new BigDecimal(200));
        assertNotNull(mockResult);
        assertEquals(mockResult, "Account created successfully", "expected message that reads as 'Account created successfully' ");

    }

    @Test
    public void withdrawCashTest()  {
        String mockResult = accountService.withdraw(123L, new BigDecimal(100));
        assertNotNull(mockResult);
        assertEquals(mockResult, "Insufficient funds for withdrawal", "expected message that reads as 'Insufficient funds for withdrawal' ");
    }

    @Test
    public void depositCashTest()  {
        Account account = new Account();
        account.setId(1);
        account.setAccountId(123L);
        account.setAmount(BigDecimal.valueOf(200));
        account.setStatus("ACTIVE");
        Mockito.when(accountsRepository.findByAccountId(123L)).thenReturn(account);
        String mockResult = accountService.deposit(123L, new BigDecimal(100));
        assertNotNull(mockResult);
        assertEquals(mockResult, "Deposit failed", "expected message that reads as 'Deposit failed' ");
    }

}
