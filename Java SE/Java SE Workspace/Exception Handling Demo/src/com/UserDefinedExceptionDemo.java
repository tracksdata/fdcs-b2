package com;

public class UserDefinedExceptionDemo {

	static void f1() throws NoSuchHotelFoundException {

		String[] hotels = { "Abc", "Xyz", "Test" };
		boolean found = false;

		for (String hotel : hotels) {
			if (hotel.equals("Abc123")) {
				found = true;
			}
		}

		if (!found) {

			throw new NoSuchHotelFoundException("No hotel Found with given name");

		} else {
			System.out.println("Hotel Found");
		}
	}

	public static void main(String[] args) throws NoSuchHotelFoundException {
		
		UserDefinedExceptionDemo.f1();

	}

}
