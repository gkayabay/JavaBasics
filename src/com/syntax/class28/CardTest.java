package com.syntax.class28;

import java.util.*;

public class CardTest {

	public static void main(String[] args) {
		// Create 3 objects of different card and store them into LinkedList.
		// Using for loop/advanced for loop/ iterator access all methods of the class.

		List<Card> cards = new LinkedList<>();

		cards.add(new AmericanExpress("AmericanExpress"));
		cards.add(new Discover("Discover"));
		cards.add(new BankOfAmerica("BankOfAmerica"));

		System.out.println("-----------Advanced Loop------------------");

		for (Card c : cards) {
			c.display();
			c.cardFee();
			c.rewards();
			System.out.println();
		}
 
		System.out.println("---------------For Loop--------------------");

		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).display();
			cards.get(i).cardFee();
			cards.get(i).rewards();
			System.out.println();
		}

		System.out.println("----------------Iterator--------------------");

		Iterator<Card> it = cards.iterator();
		while (it.hasNext()) {
			Card cd = it.next();
			cd.display();
			cd.cardFee();
			cd.rewards();
			System.out.println();
		}

	}

}
