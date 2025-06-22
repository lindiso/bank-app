package com.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountDto {
    private BigDecimal amount;
    private Long accountId;
    private String status;

    // Convert to JSON String
    public String toJson() {
        return String.format("{\"amount\":\"%s\",\"accountId\":%d,\"status\":\"%s\"}", amount, accountId, status);
    }
}
