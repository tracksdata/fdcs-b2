package com.biller;

import com.pricematrix.PriceMatrixImpl;

//Dependent class

/*
 * 		Design Issues
 * 	-------------------------
 * 
 * 	-> Too many dependency object creations
 * 		-> memory management issues
 * 		-> per of appl goes down
 * 
 * 		Why this issue happened?
 *	 ----------------------------
 *		-> Dependent class itself creating dependency class object
 *		
 *		What is the Solution?
 *	----------------------------
 *		-> Don't create dependency class objects in dependent class.
 *		-> Insted get the object from using JNDI
 *			-> JNDI location is tightlky binded with java class
 *
 *		What is the best solution?
 *	-----------------------------------
 *	-> Do not create, or do not find it. Insted ask some one (IOC)
 *
 *  DI (Dependency Injection)
 *  	-> Injecting dependency object to the dependent 
 *  
 *  	Two Ways
 *  	----------
 *  	-> setter based DI
 *  	-> constructor DI
 *
 *	
 * 	
 * 
 * 
 */

public class BillingImpl {

	private PriceMatrixImpl price;

	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}

	public double getCartTotal(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
