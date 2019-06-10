package com;


public class GenDemo<E> {
	
	void add(E x) {
		System.out.println(x.getClass().getTypeName()+" "+ x);
	}
	
	public static void main(String[] args) {
		
		
		GenDemo<String> g=new GenDemo<>();
		//g.add(3434);
		g.add("Abc");
		
	
		
		
	}

}
