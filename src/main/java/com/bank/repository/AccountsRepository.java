package com.bank.repository;

import com.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

public interface AccountsRepository extends JpaRepository<Account, Long>{

    @Transactional
    @Query("select acc.amount from Account acc where acc.accountId = :id")
    BigDecimal findCurrentBalance(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("update Account acc set acc.amount = acc.amount - :amount where acc.accountId = :accountId")
    int withdraw(@Param("accountId") Long accountId, @Param("amount") BigDecimal amount);

    Account findByAccountId(Long id);

    @Transactional
    @Modifying
    @Query("update Account acc set acc.amount = acc.amount + :amount where acc.accountId = :accountId")
    int deposit(@Param("accountId") Long accountId, @Param("amount") BigDecimal amount);
}
