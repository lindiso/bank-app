package com.bank.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNTS_SEQ")
    @SequenceGenerator(name = "id", sequenceName = "ACCOUNTS_SEQ")
    @Id
    private long id;

    private BigDecimal amount;

    @Column(nullable = false, unique = true)
    private Long accountId;
    private String status;
}
