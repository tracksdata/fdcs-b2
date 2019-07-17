package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfrastructureConfig {
	
	
	@Bean
	void f1() {
		System.out.println("--- InfrastructureConfig class f1 method");
	}

}
