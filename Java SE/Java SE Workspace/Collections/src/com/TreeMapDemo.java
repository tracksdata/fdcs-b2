package com;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Object, Object> hm = new TreeMap<>();

		hm.put(949, "Praveen");
		hm.put(1, "James");
		hm.put(222, "Kavya");
		hm.put(847, null);
		hm.put(949, "Praveen");
		hm.put(21, 49575);

		hm.put(9347, "Kiran");

		System.out.println(hm);

	}

}
