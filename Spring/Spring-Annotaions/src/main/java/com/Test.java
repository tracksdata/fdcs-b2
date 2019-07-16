package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		//Employee emp = ac.getBean(Employee.class);

		//emp.saveEmployee();
		
		System.out.println("-- Done ");
	}

}
