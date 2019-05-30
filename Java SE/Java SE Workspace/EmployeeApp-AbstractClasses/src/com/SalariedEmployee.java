package com;

public class SalariedEmployee extends Employee {

	private int noOfDaysWorked;



	@Override
	public void acceptData() {

		setEmpId(10);
		setEmpName("Jamwes");
		noOfDaysWorked = 19;

	}

	@Override
	public void processSalary() {

		setSalary(noOfDaysWorked * 5000);
		DisplayUtility.display(this);
		
		

	}

}
