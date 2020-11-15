package com.syntax.class28;

public abstract class Card {
	//HW2 Create a Card class that will have implemented  and unimplemented methods 
	//and a constructor that will initializes credit card type.  
	//Create 3 subclasses of a Card card. 
	//Create 3 objects of different card and store them into LinkedList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class.
	
	String cardType;
	
	public Card (String cardType) {
		this.cardType = cardType;
	}
	
	public void display () {
		System.out.println("Everyone should have a at least 1 credit card to built credit score for their future.");
	}
	
	public abstract void cardFee();
	public abstract void rewards();

}

class AmericanExpress extends Card {

	public AmericanExpress(String cardType) {
		super(cardType);
	}

	@Override
	public void cardFee() {
		System.out.println(cardType+ " late fee is $35.");
		
	}
	@Override
	public void rewards() {
		System.out.println(cardType+ " offers a reward, typically 1 point or 1 percent cash back, for each dollar is spend on eligible purchases.");
	}
	public void display () {
		System.out.println(cardType+ " offers $95 annual fee and flexible payment options.");
	}
	
}
class Discover extends Card {

	public Discover(String cardType) {
		super(cardType);
	
	}

	@Override
	public void cardFee() {
		System.out.println(cardType+ " late fee is $39.");
		
	}

	@Override
	public void rewards() {
		System.out.println(cardType+ " rewards never expire.If you have cashback rewards you may use at Amazon to shop online. ");
		
	}
	public void display () {
		System.out.println(cardType+ " offers NO annual fee and flexible payment options.");
	}
	
}
class BankOfAmerica extends Card {

	public BankOfAmerica(String cardType) {
		super(cardType);
		
	}

	@Override
	public void cardFee() {
	System.out.println(cardType+ " charges late fee $27 for the first late payment and up to $38 for a second late payment within the following six billing periods.");
		
	}

	@Override
	public void rewards() {
		System.out.println(cardType+ " offers 3% cash back in the category of your choice: gas, online shopping, dining, travel, drug stores, or home improvement/furnishings");
		
	}
	public void display () {
		System.out.println(cardType+ " offers NO annual fee and monthly fee.");
	}
	
}

