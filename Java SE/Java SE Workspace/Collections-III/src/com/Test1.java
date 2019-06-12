package com;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<>();

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

		Department dept = new Department();
		dept.setDeptId(100);
		dept.setDeptName("IT");

		dept.setEmps(emps);

		System.out.println("Id: " + dept.getDeptId());
		System.out.println("Name: " + dept.getDeptName());

		Employee.display(dept.getEmps());

	}

}
