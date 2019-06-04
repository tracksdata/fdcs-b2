package com;

public class Demo2 {

	public static void main(String[] args) {

		try {
			int x = 10;
			int y = x / 2;
			int i[] = new int[1];

			i[5] = 76;

			System.out.println("Y: " + y);
		} catch (ArithmeticException ae) {
			System.out.println("Faild for " + ae);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("failed due to " + ai);
		} catch (Exception e) {
			System.out.println("-- Failed due " + e);
		}

		System.out.println("-- Few Statements 1");
		System.out.println("-- Few Statements 2");

	}

}
