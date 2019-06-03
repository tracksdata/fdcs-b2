package com;

public class StringDemoV1 {

	public static void main(String[] args) {
		
		String s1=new String("Abc");
		String s2=new String("Abc");
		
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

	}

}
