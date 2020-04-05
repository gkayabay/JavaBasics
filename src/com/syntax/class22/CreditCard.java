package com.syntax.class22;

public class CreditCard {
	//Task2- Create a class CreditCard and define variable balance and interest. 
	//Create an instance method that will calculate interest based on the given balance.
	//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
	
	int balance; 
	double interestFee;
	
	public CreditCard(int balance, double interestFee) {
		this.balance=balance;
		this.interestFee=interestFee;
	}
	double chargeInterestFee() {
		if(balance<2000) {
			interestFee=balance*0.25;
		}else {
			interestFee = 0.0;
		}
		return interestFee;
	}
}
	class Visa extends CreditCard {
         
		public Visa(int balance, double interestFee) {
			super(balance, interestFee);
		}
		@ Override
		double chargeInterestFee() {
		if(balance<2000) {
			interestFee=balance*0.3;
		}else {
			interestFee = 0.0;
		}
		return interestFee;
		}
	}
	
	class AX extends CreditCard {
        
		public AX(int balance, double interestFee) {
			super(balance, interestFee);
		}
		
		double chargeInterestFee() {
		if(balance<2000) {
			interestFee=balance*0.4;
		}else {
			interestFee = 0.0;
		}
		return interestFee;
		
		}
}
