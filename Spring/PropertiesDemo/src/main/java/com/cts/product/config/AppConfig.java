package com.cts.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = { "com.cts.product.service,com.cts.product.dao" })
//@PropertySource(value = { "classpath:com/cts/product/config/db.properties" })
@PropertySource("application.properties")
public class AppConfig {

	@Autowired
	private Environment env;

	@Value("${name}")
	private String empName;

	@Bean
	public void f1() {
		System.out.println("name: " + empName);
		// System.out.println("Name: " + env.getProperty("name"));
		// System.out.println("User: "+env.getProperty("db.user"));
		// System.out.println("path: "+env.getProperty("home"));
	}

}
