package com.example.currencyprovider.externalClient;

import lombok.Data;

import java.util.List;

@Data
public class CurrencyTable {

    private String table;
    private String no;
    private String effectiveDate;
    private List<CurrencyRate> rates;
}
