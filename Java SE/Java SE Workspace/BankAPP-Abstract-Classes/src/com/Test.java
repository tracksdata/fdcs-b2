package com;

public class Test {
	
	public static void main(String[] args) {
		
		
		Customer c=new Bank();
		c.deposit();
		c.withDraw();
		
		Manager m=new Bank();
		m.openAccount();
		m.closeAccount();
		
		m.withDraw();
		m.deposit();
		
		
		
	}

}
