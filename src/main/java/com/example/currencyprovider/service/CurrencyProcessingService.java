package com.example.currencyprovider.service;

import com.example.currencyprovider.externalClient.CurrencyMessage;
import com.example.currencyprovider.externalClient.CurrencyRate;
import com.example.currencyprovider.externalClient.CurrencyTable;
import com.example.currencyprovider.externalClient.NbpClient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyProcessingService {

    // TODO: 05.04.2024 zaciągnięcie danych z NBP

    // TODO: 05.04.2024 podzielenie na info o pojedynczych walutach

    // TODO: 05.04.2024 wysyłka każdej waluty na kolejkę rabbitmq

    private final NbpClient nbpClient;
    private final RabbitTemplate rabbitTemplate;
    private final String exchangeName = "currencyExchange";
    private final String routingKey = "currencyRoutingKey";



    public void process() {
        List<CurrencyTable> currencyTables = nbpClient.getCurrencyRates();
        currencyTables.forEach(table -> table.getRates().forEach(rate -> {

            CurrencyMessage message = new CurrencyMessage(rate.getCode(), rate.getMid());
            rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
        }));
    }



}
