package com;

/*
 * 	methods
 * ------------
 * -> block of statments which can be called many number times from any where
 * Rules
 * --------
 * 	1. every method must have unique name in the same class with different signature
 * 		signature
 * 		-------
 * 			-> number of arguments
 * 			-> type of arguments
 * 			-> postion of arguments
 *  2. every method must return a value. if there are nothing to retirn, then
 *     return type must be void.
 *     
 *  3. Every method returns only value only (primitive, object or array)
 *	
 * 
 *     Polymorohism
 *     ---------------
 *     -> Appearing in many forms
 *     
 *     Two types
 *     -----------
 *     1. static polymorphism (compile time)
 *     		ex: method overloading
 *     2. dynamic polymorphism (run time)
 *     		ex: method overridding
 *     
 *    
 *     method overloading
 *     ----------------------
 *     1. same method name with different signature in the same class.
 *     
 *     Arguments
 *     ------------
 *     two types
 *     --------
 *     1. actual argument
 *     2. formal argument
 *     
 *     
 *     methods types
 *     --------------
 *     1. calling method/method declaration
 *     		t.f1(); // calling method
 *     2. called method / method defination
 *     		void f1(int dummy) {} // defination/ called method
 *     
 * 
 *    how method can be identified when calling with object?
 *    -----------------------------------------------------------
 *    
 * 
 */
public class Test {

	int f1(int x,int y) {// formal argument
		
		if(x==0 && y==0)
			return 0;
		
		return x + y;
	}
	
	String greet(String name){
		
		if(name.equals("Praveen")) {
			return "Special Message";
		}
		// compute 
		return "Good Morning "+name;
	}

	public static void main(String[] args) {

		int x = 1005;
		Test t = new Test();

		int res=t.f1(100, 200);
		System.out.println(res);
		res=t.f1(10, 20);
		System.out.println(res);
		
		System.out.println(t.greet("Praveen"));
		System.out.println(t.greet("James"));
		String s1=t.greet("Ozvitha");
		System.out.println(s1);
		

	}

}
