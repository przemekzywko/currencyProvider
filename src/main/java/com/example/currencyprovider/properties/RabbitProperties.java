package com.example.currencyprovider.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rabbit")
@Setter
@Getter
public class RabbitProperties {

    private String ratesQueueName;
}
