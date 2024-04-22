package com.example.currencyprovider.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyRateDto {

    private String code;
    private String currency;
    private BigDecimal bid;
    private BigDecimal ask;
}
