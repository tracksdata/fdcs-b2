package com.cts.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.cts.employee.dao,com.cts.employee.service" })
public class AppConfg {

	@Bean
	public void f1() {
		System.out.println("-- f1 method of AppConfig");
	}

	@Bean
	public void f2() {
		System.out.println("-- f2 method of AppConfig");
	}
}
