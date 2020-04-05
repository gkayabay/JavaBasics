package com.syntax.class22;

public class CreditCardTest {

	
public static void main(String[] args) {
		  
		CreditCard cd=new CreditCard(800, 0.25);
		double interestFee=cd.chargeInterestFee();//interestFee = cd.interestFeeden gelen degeere
		System.out.println(interestFee);
		
		Visa vs=new Visa(800,0.3);
		interestFee=vs.chargeInterestFee(); 
		System.out.println(interestFee);
		
		AX ax=new AX (800,0.4);
		interestFee=ax.chargeInterestFee();
		System.out.println(interestFee);
		
	}
}
	

