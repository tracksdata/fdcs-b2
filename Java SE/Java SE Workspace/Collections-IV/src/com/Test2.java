package com;

import java.util.Hashtable;

public class Test2 {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable<String, String>();
		ht.put("chec", "check");
		ht.put(1000, "check"); // line 1
		ht.put("check", 20.01); // line 2
		System.out.print(ht.get("chec") + " ");
		System.out.print(ht.get(1000) + " "); //line 3
		System.out.print(ht.get("check")); //line 4

	}

}
