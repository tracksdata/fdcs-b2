package com;

public class DisplayUtility {
	
	public static void display(Employee emp) {
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("-------------------------------");
		
	}

}
