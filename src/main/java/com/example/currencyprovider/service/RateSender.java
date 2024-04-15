package com.example.currencyprovider.service;

import com.example.currencyprovider.model.CurrencyRateDto;
import com.example.currencyprovider.properties.RabbitProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RateSender {

    private final RabbitTemplate rabbitTemplate;
    private final RabbitProperties rabbitProperties;

    public void sendRates(CurrencyRateDto currencyRateDto) {
        rabbitTemplate.convertAndSend(rabbitProperties.getRatesQueueName(), currencyRateDto);
    }
}
