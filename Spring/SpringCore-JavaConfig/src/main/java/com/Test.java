package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.config.InfrastructureConfig;
import com.cts.product.config.WebConfig;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ac.register(AppConfig.class, InfrastructureConfig.class, WebConfig.class);
		//ac.refresh();
		
		// 

	}

}
