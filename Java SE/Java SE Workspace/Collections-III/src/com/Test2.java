package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {

		Card c1 = new Card(123456, "VISA", "Praveen");
		Card c2 = new Card(123457, "VISA", "James");
		Card c3 = new Card(123458, "VISA", "Riu");
		Card c4 = new Card(123459, "MASTER", "Bucky");
		Card c5 = new Card(123451, "MASTER", "Ozvitha");
		Card c6 = new Card(123452, "MSATER", "Divya");

		ArrayList<Card> debit = new ArrayList<Card>();
		ArrayList<Card> credit = new ArrayList<Card>();

		debit.add(c1);
		debit.add(c2);
		debit.add(c3);

		credit.add(c4);
		credit.add(c5);
		credit.add(c6);

		Map<String, List<Card>> cardBrand = new HashMap<>();
		cardBrand.put("Debit", debit);
		cardBrand.put("Credit", credit);

		// Display Only Debit card Info

		Set<String> cardTypes = cardBrand.keySet();

		for (String brand : cardTypes) {

			if (brand.equals("Credit")) {

				Card.display(cardBrand.get(brand));

			}

		}
	}

}
