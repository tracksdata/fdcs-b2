package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service // service
//@Repository // DAO
//@Controller  // Web  MVC
@Configuration // COnfuguring other classes
@Lazy(value=true)
@Scope(value="prototype")
public class Employee {

	public Employee() {
		System.out.println("-- Employee Object created");
	}

	public void saveEmployee() {
		System.out.println("-- Saving employee");
	}

}
