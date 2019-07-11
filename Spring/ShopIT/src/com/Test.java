package com;

import com.biller.BillingImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P004", "P005" };

		PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency class object
		
		//-------------------------------------
		BillingImpl bill = new BillingImpl(); // Dependent class object
		bill.setPrice(price); /// DI

		double total = bill.getCartTotal(cart1);
		//--------------------------------------
		
		
		System.out.println("Cart1 Total: " + total);

		total = bill.getCartTotal(cart2);
		System.out.println("Cart2 Total: " + total);
	}

}
