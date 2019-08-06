package com.cts.product.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cts.product.entities.Product;

public interface ProductDao extends MongoRepository<Product, String>{
	
	
	List<Product> findByNameIsLike(String name);
	
	@Query("{ 'name' : ?0 }")
	List<Product> listOnlyIpadProducts(String name);
	
	
	
	

}
