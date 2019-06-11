package com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> hs = new LinkedHashSet<>();
		hs.add("Praveen");
		hs.add("Uames");
		hs.add(847334);
		hs.add("Kavya");
		hs.add(3);
		hs.add(4545.53f);
		hs.add('A');
		hs.add("Praveen");

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

	}

}
