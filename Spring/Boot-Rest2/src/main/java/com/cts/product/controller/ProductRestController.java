package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductRestController {

	@GetMapping
	public Product f1() {
		Product prod = new Product();
		prod.setId("P001");
		prod.setName("Pen");
		prod.setPrice(474);

		return prod;
	}

	@GetMapping("/all")
	public List<Product> f2() {
		Product prod = new Product();
		prod.setId("P001");
		prod.setName("Laptop");
		prod.setPrice(474);

		Product prod1 = new Product();
		prod1.setId("P002");
		prod1.setName("Pen");
		prod1.setPrice(34);

		Product prod2 = new Product();
		prod2.setId("P003");
		prod2.setName("Book");
		prod2.setPrice(2343);

		List<Product> prods = new ArrayList<>();
		prods.add(prod);
		prods.add(prod1);
		prods.add(prod2);

		return prods;
	}

}
