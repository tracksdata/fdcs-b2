package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BootDataJpaApplication.class, args);

		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProdId("P032");
		prod.setProdName("Iphone Mini");
		prod.setPrice(454);
		
		//ps.saveProduct(prod);
		
		
		
		for(Product p:ps.listOnlyIpadProducts()) {
			
			System.out.println(p.getProdId());
			System.out.println(p.getProdName());
			System.out.println(p.getPrice());
			System.out.println("------------------");
		}
		
		

	}

}
