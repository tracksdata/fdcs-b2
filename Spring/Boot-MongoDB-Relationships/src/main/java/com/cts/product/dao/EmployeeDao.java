package com.cts.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.entities.Employee;

public interface EmployeeDao extends MongoRepository<Employee, Integer>{

}
