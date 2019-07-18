package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Transactional
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

	@Transactional
	public Product findPrductById(String prodId) {
		return prodDao.findById(prodId);
	}

	@Transactional
	public List<Product> findProductsdByName(String prodName) {
		return prodDao.findProductsByName(prodName);
	}

	@Transactional
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Transactional
	public Product updateProduct(Product prod) {
		return prodDao.updateProduct(prod);
	}

}
