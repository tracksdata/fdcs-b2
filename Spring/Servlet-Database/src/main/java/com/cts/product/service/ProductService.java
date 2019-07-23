package com.cts.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entities.Product;

public interface ProductService {

	void saveProduct(Product prod);

	Product findPrductById(String prodId);

	List<Product> findProductsdByName(String prodName);

	List<Product> findAll();

	Product updateProduct(Product prod);

}