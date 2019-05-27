package com;

public class Notes {
	/*
	 * 		Arrays
	 * 	--------------
	 * 	
	 * -> Collection of same data type
	 * -> Index based one
	 * -> index starts with 0 ends with size-1
	 * 
	 * Note
	 * ---
	 * -> Array by default is an object in java
	 * 
	 * two types
	 * -------
	 * 1-> 1-D
	 * 2-> 2-D
	 * 
	 * 
	 */
	
	static void f1(int[] nos) {
		
		nos[1]=1500;
		
	}
	
	public static void main(String[] args) {
		
		
		
		int x[]= {10,20,30,40,50,60};
		System.out.println("In Main Method");
		
		//System.out.println(i[0]);
		//System.out.println(i[1]);
		//System.out.println(i[2]);
		//System.out.println(i[3]);
		//System.out.println(i[4]);
		//System.out.println(i[5]);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("-------------------------");
		
		f1(x);// actual argument
		
		System.out.println(x[1]);
		
		// length
		
		//System.out.println(i.length);
		
		
		
		
	}
}
