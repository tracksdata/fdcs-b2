package com.cts.product.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductController {
	
	
	@GetMapping
	public String f1() {
		return "Good Evening";
	}

}
