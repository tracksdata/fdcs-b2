package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier(value="orderDao")
	private ProductDao prodDao;
	
	
	@Override
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

	@Override
	public Product findById(String prodId) {
		return prodDao.findById(prodId);
	}

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

}
