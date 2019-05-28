package com;

/*
 * Notes
 * ----------
 * 		-> Super class reference can store / hold all its sub class objects
 * 		-> The reference of the super class can be used to acess all the methods in the
 *         super class and overrriden methods from the sub class
 *      -> The reference of the super class can not  access individual methods of 
 *         a sub class (a  method which is present in the sub class and not present 
 *         in the super class)
 *         
 */

public class Test {

	public static void main(String[] args) {

		Shape s;
		
		s = new Rectangle();
		s.draw();
		s.display();
		//s.f1();
		

		
		
		s = new Circle();
		s.draw();
		s.display();
		
		/*
		 * Circle c=new Circle(); c.draw(); //c.f2();
		 * 
		 * Rectangle r=new Rectangle(); r.draw();
		 */

	}

}
