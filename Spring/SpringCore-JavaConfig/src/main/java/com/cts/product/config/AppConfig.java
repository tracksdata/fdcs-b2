package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { InfrastructureConfig.class, WebConfig.class })
public class AppConfig {

	@Bean
	void f3() {
		System.out.println("--- AppConfig class f1 method");
	}

}
