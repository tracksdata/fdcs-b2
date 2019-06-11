package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		// Add Objects

		ar.add("Praveen");
		ar.add("James");
		ar.add(3463);
		ar.add(5);
		ar.add(3846.34f);
		ar.add('A');
		ar.add("Praveen");
		ar.add(true);
		ar.add(2, "Ritu");

		System.out.println(ar);

		// get specific indexed object
		System.out.println(ar.get(2));

		// get AL size
		System.out.println(ar.size());

		// Remove element from AL
		ar.remove(5);
		System.out.println("----------");
		System.out.println(ar);
		System.out.println(ar.size());

		// Remove by Object name

		ar.remove("Ritu");

		System.out.println("----------");
		System.out.println(ar);
		System.out.println(ar.size());

		ar.remove(new Integer(5));

		System.out.println("----------");
		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println("----------------------");

		// Update new date with existing data

		ar.set(1, "Bucky Wall");
		System.out.println(ar);
		System.out.println(ar.size());

		// ar.clear();

		if (ar.contains("Bucky Wall1")) {
			ar.add("Rose");
		}

		System.out.println("----------");
		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println("--------------------------------------------");

		// 1. for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("--------------------------------------------");

		// 2. For each

		for (Object obj : ar) {

			if (obj.equals("Bucky Wall")) {
				// ar.remove("Praveen");
			}
			System.out.println(obj);
		}

		System.out.println("--------------------------------------------");

		// 3. Iterator Interface
		Iterator<Object> it = ar.iterator();

		while (it.hasNext()) {
			Object obj = it.next();

			if (obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}
		System.out.println("---------------");
		System.out.println(ar);

		System.out.println("--------------------------------------------");

		// 4. ListIterator

		ListIterator<Object> li = ar.listIterator();

		while (li.hasNext()) {
			Object obj = li.next();
			if (obj.equals("Bucky Wall")) {
				li.add("Ruby");
			}

			if (obj.equals(new Integer(3463))) {
				li.set("Praveen");
			}
			
			
			System.out.println(obj);
		}

		System.out.println("-----------------");
		System.out.println(ar);

	}

}
