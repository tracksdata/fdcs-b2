package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override

	public Product saveProduct(Product prod) {
		return prodDao.save(prod);
	}

	@Override
	public Product findByproductId(String prodId) {
		return prodDao.findById(prodId).orElse(null);
	}

	@Override
	public List<Product> findByProductName(String prodName) {
		return prodDao.findByProdNameIsLike(prodName);
	}

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override

	public List<Product> listOnlyIpadProducts() {
		return prodDao.listOnlyIpadProducts();
	}

	@Override
	public Product updateProduct(Product prod) {
		return prodDao.save(prod);
	}

	@Override
	public void updateProductById(String prodId) {

	}

	@Override
	public void deleteProductById(String prodId) {

		prodDao.deleteById(prodId);
	}

	@Override
	public void deleteProduct(Product prod) {

		prodDao.delete(prod);
	}

}
