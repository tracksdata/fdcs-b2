package com.cts.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductRestController {

	@GetMapping
	public String f1() {
		return "f1 method for Get mapping";
	}
	
	
	
	@GetMapping("/{prodId}")
	public String f5(@PathVariable("prodId") String id) {
		return "f5 method for getting a provided product id "+id;
	}

	@PostMapping()
	public void f2() {
		System.out.println("----> Test for post");
		//-----
		//return "f2 method for Post Mapping";
	}

	
	@PutMapping
	public String f3() {
		return "f3 method for Put Mapping";
	}

	@DeleteMapping
	public String f4() {
		String s1 = "Abc";
		if (s1.equals("Abc")) {
			throw new RuntimeException("Bla Bala");
		}

		return "f4 method for Delete Mapping";
	}

}
