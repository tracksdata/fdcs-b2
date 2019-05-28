package com;

public class ContractEmployee extends Employee {

	private int noOfHoursWorked;

	@Override
	public void acceptData() {
		setEmpId(1024);
		setEmpName("Praveen");
		noOfHoursWorked = 80;

	}

	public void personalData() {
		System.out.println("--- Contract Employee Personal information");
	}

	@Override
	public void processSalary() {

		setSalary(noOfHoursWorked * 2000);
		DisplayUtility.display(this);

	}

}
