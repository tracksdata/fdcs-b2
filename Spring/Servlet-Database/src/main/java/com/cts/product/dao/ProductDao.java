package com.cts.product.dao;

import java.util.List;

import com.cts.product.entities.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	Product findById(String prodId);

	List<Product> findProductsByName(String prodName);

	List<Product> findAll();

	Product updateProduct(Product prod);

}