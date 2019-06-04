package com;

public class ThrowDemo {

	public static void main(String[] args) {

		int x = -1000;

		try {

			if (x < 0) {
				throw new Exception("Number shoud be positive only");
			}

			System.out.println("Number is " + x);

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
