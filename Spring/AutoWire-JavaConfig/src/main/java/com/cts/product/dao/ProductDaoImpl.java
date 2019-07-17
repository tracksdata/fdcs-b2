package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository("prodDao")
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
