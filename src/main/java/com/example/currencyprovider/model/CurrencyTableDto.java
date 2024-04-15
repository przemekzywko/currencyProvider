package com.example.currencyprovider.model;

import lombok.Data;

import java.util.List;

@Data
public class CurrencyTableDto {

    private String table;
    private String no;
    private String effectiveDate;
    private List<CurrencyRateDto> rates;
}
