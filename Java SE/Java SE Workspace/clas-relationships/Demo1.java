package com;

public class Demo1 {

	public static void main(String[] args) {

		try {
			int x = 10;
			int y = x / 2;

			System.out.println("Y: " + y);
		} 
		catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			System.out.println("-- Always executed");

		}

		System.out.println("-- Few Statements 1");
		System.out.println("-- Few Statements 2");

	}

}
