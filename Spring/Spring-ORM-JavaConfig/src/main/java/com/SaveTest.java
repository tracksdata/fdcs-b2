package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

public class SaveTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();

		prod.setProdName("Laptop");
		prod.setProdId("P006");
		prod.setPrice(845478);

		ProductService ps = ctx.getBean(ProductService.class);
		ps.saveProduct(prod);

		ctx.close();
	}

}
