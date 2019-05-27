package com;

public class SOrtDemo {

	public static void main(String[] args) {

		int nos[] = { 34, 32, 65, 675, 2, 3 };

		int key = 3766;

		int index = 0;
		boolean found = false;

		for (int i = 0; i < nos.length; i++) {
			if (nos[i] == key) {
				index = i;
				found = true;
				break;
			}
		}

		if (found == true) {
			System.out.println(key + " found at " + index);
		} else {
			System.out.println(key + " does not found in array");
		}

	}

}
