package com.example.currencyprovider.externalClient;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CurrencyRate {

    private String currency;
    private String code;
    private BigDecimal mid;
}
