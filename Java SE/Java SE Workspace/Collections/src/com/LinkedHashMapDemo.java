package com;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Object, Object> hm = new LinkedHashMap<>();

		hm.put(949, "Praveen");
		hm.put(1, "James");
		hm.put(222, "Kavya");
		hm.put("p1", "SPR");
		hm.put(949, "Praveen");
		hm.put(21, 49575);
		hm.put(null, null);
		hm.put(9347, "Kiran");
		hm.put(null, "ksdk");
		hm.put(4837, null);
		

		System.out.println(hm);

	}

}
