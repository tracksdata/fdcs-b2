package com.cts.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.entities.Sales;

public interface SalesDao extends MongoRepository<Sales, String>{

}
