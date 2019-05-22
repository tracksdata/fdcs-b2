package com;

public class HR {

	public static void main(String[] args) {

		Department d1 = new Department();
		d1.deptId = 10;
		d1.deptName = "IT";

		Department d2 = new Department();
		d2.deptId = 11;
		d2.deptName = "Accounts";

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.empId = 1;
		e1.empName = "Prveen";

		e2.empId = 2;
		e2.empName = "James";
		
		e1.setDept(d1);
		e2.setDept(d2);
		
		
		e1.display();
		e1.getDept().display();
		
		
		System.out.println("-----------------");
		e2.display();
		e2.getDept().display();
		

	}

}
