package com.example.currencyprovider;

import com.example.currencyprovider.properties.RabbitProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(RabbitProperties.class)
@EnableScheduling
public class CurrencyProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyProviderApplication.class, args);
	}
	//

}
