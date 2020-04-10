package com.syntax.class25;

public class BOATest {

	public static void main(String[] args) {
		
		BOA bank = new BOA();
		bank.trust();
		bank.deposit();
		bank.financing();
		bank.giveCredit();
		bank.withdraw();
		
		Bank b = new BOA(); //upcasting. create object of BOA and is referiring to the parent type
		b.trust();//comes from Trustable interface
		b.deposit(); //comes from Bank
		b.withdraw(); //comes from Bank
	
	    Trustable t = new BOA();
	    t.trust();
	   
	}
	
}
