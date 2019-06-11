package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();
		hs.add("Praveen");
		hs.add("Uames");
		hs.add(847334);
		hs.add("Kavya");
		hs.add(3);
		hs.add(4545.53f);
		hs.add('A');
		hs.add("Praveen");
		// hs.add(null);

		System.out.println(hs);

		if (hs.contains("Kavya")) {
			System.out.println("True");
		}
		System.out.println(hs.size());

		hs.remove("Kavya");

		System.out.println("----------");
		System.out.println(hs);

		// --------------------------

		for (Object obj : hs) {
			System.out.println(obj);
		}

		System.out.println("--------------");

		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//
		System.out.println("--------------------------------");

		ArrayList<Object> ar = new ArrayList<>(hs);
		System.out.println(ar);
		ar.set(0, "Somethiong");
		System.out.println(ar);

		ArrayList<Object> ar1 = new ArrayList<>();
		ar1.add("Praveen");
		ar1.add("James");
		ar1.add("Kiran");
		ar1.add("Praveen");
		
		HashSet<Object> hs1=new HashSet<>(ar1);
		System.out.println(hs1);
		

	}

}
