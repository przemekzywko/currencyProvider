package com.example.currencyprovider.service;

import com.example.currencyprovider.client.NbpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyProcessingService {

    // TODO: 05.04.2024 zaciągnięcie danych z NBP

    // TODO: 05.04.2024 podzielenie na info o pojedynczych walutach

    // TODO: 05.04.2024 wysyłka każdej waluty na kolejkę rabbitmq

    private final NbpClient nbpClient;
    private final RateSender rateSender;

    private final String exchangeName = "currencyExchange";
    private final String routingKey = "currencyRoutingKey";


    public void process() {
        nbpClient.getCurrencyRates().stream()
                .flatMap(currencyTableDto -> currencyTableDto.getRates().stream())
//                .map(CurrencyTable::getRates)
//                .flatMap(List::stream)
                .forEach(rateSender::sendRates);
    }


}
