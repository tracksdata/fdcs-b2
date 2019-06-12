package com;

import java.util.HashMap;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		HashMap<Integer, Employee> emps = new HashMap<>();

		Employee e1 = new Employee(54, "Kgf", 15000);
		Employee e2 = new Employee(12, "Sdf", 17000);
		Employee e3 = new Employee(26, "Abc", 12000);
		Employee e4 = new Employee(11, "Egf", 16000);
		Employee e5 = new Employee(15, "Jfd", 11000);

		emps.put(e1.getEmpId(), e1);
		emps.put(e2.getEmpId(), e2);
		emps.put(e3.getEmpId(), e3);
		emps.put(e4.getEmpId(), e4);
		emps.put(e5.getEmpId(), e5);

		// Convert Map keys into SET

		Set<Integer> keys = emps.keySet();

		for (Integer key : keys) {
			System.out.println(emps.get(key).getEmpId());
			System.out.println(emps.get(key).getEmpName());
			System.out.println(emps.get(key).getSalary());
			System.out.println("-----------------------------");
		}

	}

}
