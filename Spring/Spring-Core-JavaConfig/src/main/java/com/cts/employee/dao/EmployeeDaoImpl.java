package com.cts.employee.dao;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl {
	
	@Bean
	public void test() {
		System.out.println("--- EmployeeDaoImpl test method");
	}

	public void saveEmployee() {
		System.out.println("Dao: Employee Saved");
	}

}
