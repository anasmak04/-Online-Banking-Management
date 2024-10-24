package com.bankapp.server.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    @NotNull(message = "Amount cannot be null")
    private Double amount;

    @NotNull(message = "Type cannot be null")
    private String type;

    @NotNull(message = "Account ID cannot be null")
    private Long accountId;
}
