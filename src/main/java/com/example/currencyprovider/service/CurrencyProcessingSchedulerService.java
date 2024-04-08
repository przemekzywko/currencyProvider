package com.example.currencyprovider.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyProcessingSchedulerService {

    private final CurrencyProcessingService currencyProcessingService;

    @Scheduled(cron = "${daily.info.cron}") // TODO: 05.04.2024 cyklicznie - może być co minutę +
    public void startProcessing() {
        currencyProcessingService.process();
    }
}
