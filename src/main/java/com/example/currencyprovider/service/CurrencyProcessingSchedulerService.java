package com.example.currencyprovider.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyProcessingSchedulerService {

    private final CurrencyProcessingService currencyProcessingService;

    @Scheduled(cron = "${daily.info.cron}") // TODO: 05.04.2024 cyklicznie - może być co minutę +
    public void startProcessing() {
        log.info("Start processing currency data");
        currencyProcessingService.process();
    }
}
