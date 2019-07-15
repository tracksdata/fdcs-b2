package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = ac.getBean("e3", Employee.class);
		Employee emp1 = ac.getBean("myEmp", Employee.class);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		System.out.println(emp1.getEmpId());

		System.out.println("---- Done ----");

		ac.registerShutdownHook();
		ac.close();
	}

}
