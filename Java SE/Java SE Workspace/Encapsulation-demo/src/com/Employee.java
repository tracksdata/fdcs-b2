package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {

		// Calcute

		return salary;
	}

	public void setSalary(double salary) {
		// how days worked
		// validation
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

}
