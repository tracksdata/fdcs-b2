package com;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {

		HashSet<Employee> emps = new HashSet<>();

		Employee e1 = new Employee(54, "Kgf", 15000);
		Employee e2 = new Employee(12, "Sdf", 17000);
		Employee e3 = new Employee(26, "Abc", 12000);
		Employee e4 = new Employee(11, "Egf", 16000);
		Employee e5 = new Employee(15, "Jfd", 11000);

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		
		for(Employee emp:emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------");
		}
		
		
		

	}

}
