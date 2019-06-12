package com;

import java.util.List;

public class Card {

	private long cardNumber;
	private String cardType;
	private String custName;

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(long cardNumber, String cardType, String custName) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.custName = custName;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public static void display(List<Card> cards) {

		System.out.println("CardType\tCardNumber\tCustName");
		System.out.println("-----------------------------------");
		for (Card card : cards) {
			System.out.print(card.getCardType() + "\t" + card.getCardNumber() + "\t" + card.getCustName());
			System.out.println();
		}

	}

}
