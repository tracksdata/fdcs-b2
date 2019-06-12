package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class SoryBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}

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

		System.out.println("Original Data");
		Employee.displayV1(emps);
		System.out.println("---------------------");

		System.out.println("SORT BY ID");
		Collections.sort(emps);
		Employee.display(emps);
		System.out.println("---------------------");

		System.out.println("SORT BY NAME");
		Collections.sort(emps, new Employee());
		Employee.display(emps);
		System.out.println("---------------------");

		System.out.println("SORT BY Salary");
		Collections.sort(emps, new SoryBySalary());
		Employee.display(emps);
		System.out.println("---------------------");
		
		Date d=new Date();
		System.out.println(d);
		
		
		
		
		
		
	}

}
