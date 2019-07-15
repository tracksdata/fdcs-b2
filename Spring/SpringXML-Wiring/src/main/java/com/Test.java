package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = ac.getBean("myEmp", Employee.class);
		Department dept = ac.getBean("myDept", Department.class);

		emp.setDept(dept);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());

		System.out.println("---- Done ----");

		ac.registerShutdownHook();
		ac.close();
	}

}
