package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

public interface ProductService {

	void setProdDao(ProductDao prodDao);

	void saveProduct(Product prod);

	Product findById(String prodId);

	List<Product> findAll();

}