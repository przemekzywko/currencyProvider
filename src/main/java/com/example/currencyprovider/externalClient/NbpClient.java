package com.example.currencyprovider.externalClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "nbpClient", url = "${nbp.api.url}")
public interface NbpClient {

    @GetMapping("/api/exchangerates/tables/C")
    List<CurrencyTable> getCurrencyRates();
}
