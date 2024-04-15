package com.example.currencyprovider.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyRateDto {

    private String currency;
    private String code;
    private BigDecimal bid;
    private BigDecimal ask;
}
