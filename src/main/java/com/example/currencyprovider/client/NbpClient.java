package com.example.currencyprovider.client;

import com.example.currencyprovider.model.CurrencyTableDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "nbpClient", url = "${nbp.api.url}")
public interface NbpClient {

    @GetMapping("/tables/C")
    List<CurrencyTableDto> getCurrencyRates();
}
