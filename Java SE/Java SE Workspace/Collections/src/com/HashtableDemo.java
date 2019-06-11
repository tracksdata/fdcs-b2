package com;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Object, Object> hm = new Hashtable<>();

		hm.put(949, "Praveen");
		hm.put(1, "James");
		hm.put(222, "Kavya");
		hm.put(847, "James");
		hm.put(949, "Praveen");
		hm.put(21, 49575);

		hm.put(9347, "Kiran");

		System.out.println(hm);

	}

}
