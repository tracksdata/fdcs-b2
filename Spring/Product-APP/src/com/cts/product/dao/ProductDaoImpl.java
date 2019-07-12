package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void saveProduct(Product prod) {
		System.out.println("Dao: " + prod.getProdName() + " saved to DB");
	}

	@Override
	public Product findById(String prodId) {
		return null;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

}
