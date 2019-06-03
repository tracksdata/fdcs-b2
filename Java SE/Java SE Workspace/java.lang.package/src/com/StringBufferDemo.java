package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
	
		
		StringBuffer s1=new StringBuffer("Abc");
		System.out.println("S1: "+s1);
		System.out.println("s1 Hashcode: "+s1.hashCode());
		System.out.println("S1 Identity Hash Code: "+System.identityHashCode(s1));
		
		//s1.reverse();
		
		s1.insert(0,"Xyz");
		
		System.out.println("-----------------");
		System.out.println("S1: "+s1);
		System.out.println("s1 Hashcode: "+s1.hashCode());
		System.out.println("S1 Identity Hash Code: "+System.identityHashCode(s1));
		
		StringBuffer s2=s1.reverse();
		
		System.out.println("-----------------");
		System.out.println("S2: "+s2);
		System.out.println("s2 Hashcode: "+s2.hashCode());
		System.out.println("S2 Identity Hash Code: "+System.identityHashCode(s2));
		
		s1.append("Praveen");
		
		System.out.println("-----------------");
		System.out.println("S2: "+s2);
		System.out.println("s2 Hashcode: "+s2.hashCode());
		System.out.println("S2 Identity Hash Code: "+System.identityHashCode(s2));
		
		System.out.println("-----------------");
		System.out.println("S1: "+s1);
		System.out.println("s1 Hashcode: "+s1.hashCode());
		System.out.println("S1 Identity Hash Code: "+System.identityHashCode(s1));
		
	}

}
