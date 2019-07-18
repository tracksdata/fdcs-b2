package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class FindTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ctx.getBean(ProductService.class);
		Product prod = ps.findPrductById("P001");

		System.out.println(prod.getProdId());
		System.out.println(prod.getProdName());
		System.out.println(prod.getPrice());

		ctx.close();
	}

}
