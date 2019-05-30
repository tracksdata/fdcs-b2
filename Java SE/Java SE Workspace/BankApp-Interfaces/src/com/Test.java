package com;

import java.io.Writer;

public class Test {

	public static void main(String[] args) {

		Customer cust = new Bank();
		cust.withDraw();
		cust.deposit();

		Manager m = new Bank();
		m.openAccount();
		m.closeAccount();

		Cleark c = new Bank();
		c.clearkOperations();

	}

}
