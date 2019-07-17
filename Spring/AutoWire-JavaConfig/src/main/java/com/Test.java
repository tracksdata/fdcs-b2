package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(384673434);

		ProductService prodService = ac.getBean(ProductService.class);

		prodService.saveProduct(prod);

		ac.close();

	}

}
