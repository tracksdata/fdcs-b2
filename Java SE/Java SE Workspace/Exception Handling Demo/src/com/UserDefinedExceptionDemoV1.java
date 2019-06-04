package com;

public class UserDefinedExceptionDemoV1 {

	public static void main(String[] args) {

		String[] hotels = { "Abc", "Xyz", "Test" };
		boolean found = false;

		for (String hotel : hotels) {
			if (hotel.equals("Abc123")) {
				found = true;
			}
		}

		if (!found) {

			throw new NoSuchHotelFoundExceptionV1("No hotel Found with given name");

		} else {
			System.out.println("Hotel Found");
		}

	}

}
