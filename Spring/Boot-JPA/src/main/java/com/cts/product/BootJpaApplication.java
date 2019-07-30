package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BootJpaApplication.class, args);

		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProdId("P030");
		prod.setProdName("Ipad Wifi");
		prod.setPrice(1212);

		//ps.saveProduct(prod);
		
		
	for(Product p:ps.findAll()) {
		System.out.println(p.getProdId());
		System.out.println(p.getProdName());
		System.out.println(p.getPrice());
		System.out.println("------------------");
	}
		

	}

}
