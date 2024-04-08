package com.example.currencyprovider.externalClient;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CurrencyMessage {

    private String code;
    private BigDecimal rate;
}
