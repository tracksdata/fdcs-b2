package com;

public class Employee {
	
	int empId;
	String empName;
	
	Department dept; // has 'A' relationship
	
	void setDept(Department dept) {
		this.dept=dept;
	}
	
	Department getDept(){
		return dept;
	}
	
	
	void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		//dept.display();
		//System.out.println("-----------------");
		
	}

}
