package com;

import java.util.Objects;

/*
 *  Types of classes
 *  -----------------
 *  1. Simple class
 *  2. Complex class
 *  
 *   Hashing Technique
 *   --------------------
 *   
 * 
 */

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			System.out.println("True");
		}

		Employee emp = (Employee) obj;

		return ((emp.id == id) && (emp.name.equals(name)));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id is " + id + " and name is " + name;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {

		String s2 = "test";
		String s1 = "test";

		Employee e1 = new Employee(1024, "Praveen");
		Employee e2 = new Employee(1024, "Praveen");

		System.out.println("S1: " + s1);
		System.out.println("S1 Hashcode: " + s1.hashCode());
		System.out.println("S1 Identity hashcode: " + System.identityHashCode(s1));
		System.out.println("-----------------");
		System.out.println("S2 Hashcode: " + s2.hashCode());
		System.out.println("S2 Identity hashcode: " + System.identityHashCode(s2));

		System.out.println("------------------------------");

		System.out.println("E1 Hashcode: " + e1.hashCode());
		System.out.println("E1 Identity hashcode: " + System.identityHashCode(e1));

		System.out.println("------------------------------");

		System.out.println("E2 Hashcode: " + e2.hashCode());
		System.out.println("E2 Identity hashcode: " + System.identityHashCode(e2));

		System.out.println("-----------------");

		if (e1.equals(e2)) {
			System.out.println("-- Equal");
		} else {
			System.out.println("Not Equal");
		}

		System.out.println("--------------");
		System.out.println(e1);
		System.out.println(e2);
	}

}
