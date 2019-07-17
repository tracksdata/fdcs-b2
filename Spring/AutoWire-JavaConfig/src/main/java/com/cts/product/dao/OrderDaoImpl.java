package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Order;
import com.cts.product.model.Product;

@Repository(value="orderDao")
public class OrderDaoImpl implements ProductDao {

	public void processOrder(Order order) {
		System.out.println("Dao: Processing " + order.getOrderId() + " Details");
	}

	public List<Order> findAllOrders() {
		return null;
	}

	@Override
	public void saveProduct(Product prod) {
		System.out.println("OrderDao: Saving  " + prod.getProdName() + " to DB");

	}

	@Override
	public Product findById(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
