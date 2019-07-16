package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean(Employee.class);

	//	Department dept = ac.getBean(Department.class);

	//	emp.setDept(dept);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());

		ac.close();

	}

}
