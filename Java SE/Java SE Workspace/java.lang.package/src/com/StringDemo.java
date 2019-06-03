package com;

/*
 * Notes
 * -------
 * 		Types of Objects
 * 
 * 			1. Immutable (Content of the object can not be modified on same hash code)
 * 				Ex: String , and all wrapper classes
 * 			2. Mutable (Content if the object can be modified on same hash code)
 * 				Ex: StringBuffer, StringBuilder 
 * 
 *    -> String class is a final class
 *    -> String class overrides equals and hash code method
 *    
 */
public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Abc";

		System.out.println("S1: " + s1);
		// System.out.println("S1 hashcode: "+s1.hashCode());
		System.out.println("S1 Identity Hash code: " + System.identityHashCode(s1));

		System.out.println("-------------------");

		String s2 = new String("ABC");

		System.out.println("S2: " + s2);
		// System.out.println("S2 hashcode: "+s2.hashCode());
		System.out.println("S2 Identity Hash code: " + System.identityHashCode(s2));

		System.out.println("-------------------");
		
	

		if (s1.equals(s2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		
		
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		for(int i=97;i<=122;i++) {
			System.out.print((char)i+" ");
		}
		
		char ch='D';
		System.out.println();
		System.out.println((char)(ch+32));
		
		//System.out.println();
		
		
		

	}

}
