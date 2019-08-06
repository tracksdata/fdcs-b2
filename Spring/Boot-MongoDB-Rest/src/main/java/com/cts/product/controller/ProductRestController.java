package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("api/products")
public class ProductRestController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public ResponseEntity<List<Product>> listAll(){
		return ResponseEntity.ok(ps.findAll());
	}
	
	@GetMapping("/{prodId}")
	public ResponseEntity<?> findProductByid(@PathVariable("prodId")String prodId) {
		
		Product prod=ps.findByproductId(prodId);
		
		if(prod!=null) {
			return ResponseEntity.ok(prod);
		}
		
		return ResponseEntity.ok().body(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody Product prod) {
		
		Product p=ps.saveProduct(prod);
		return ResponseEntity.ok(p);
		
	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product prod){
		
		Product p=ps.findByproductId(prod.getId());
		
		if(p!=null) {
			return ResponseEntity.ok(ps.saveProduct(prod));
		}
		
		return ResponseEntity.badRequest().body(HttpStatus.NO_CONTENT);
		
	}
	
	@DeleteMapping("/{prodId}")
	public ResponseEntity<?> deleteProduct(@PathVariable("prodId")String prodId) {
		
		ps.deleteProductById(prodId);
		
		
		return ResponseEntity.ok(HttpStatus.valueOf(204));
		
	}
	
	
	

}
