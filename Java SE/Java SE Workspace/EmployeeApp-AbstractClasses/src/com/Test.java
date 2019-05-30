package com;

public class Test {

	public static void main(String[] args) {

		Employee emp;
		emp = new SalariedEmployee();
		emp.acceptData();
		emp.processSalary();
		//emp.display();
		//emp.copyRights();

		emp = new ContractEmployee();
		emp.acceptData();
		emp.processSalary();
		//emp.display();
		//emp.copyRights();
		//emp.p

	}

}
