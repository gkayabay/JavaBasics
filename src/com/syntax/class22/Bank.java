package com.syntax.class22;

public class Bank {
	
	double money, fee;
	
	public Bank(double money) {
		this.money = money;
	}
	
	double chargeFee() { //overridden method
		if(money<1000) {
			fee= money*0.1;
		}else {
		 fee = 0;
		}
		return fee;
		}
	}

	
	 class PNC extends Bank {
		 public PNC (double money) {
			 super(money);//calls parent class constructor
		 }
	
		 @Override
	   double chargeFee() { //overriding method (happens in child class)i am not satisfied with the parent method i want to create my own with the same name method
			if(money<1000) {
				fee= money*0.2; 
			}else {
			 fee = 0;
			}
			return fee;
		 }
	 }
	 class TD extends Bank {
		 public TD(double money) {
			 super(money);
		 }
		 double chargeFee() {
			 if(money<1000) {
				 fee=money*0.3;
			 }else {
				 fee=0;
				 }
			 return fee;
		 }
	 }
			  
			 class BOA extends Bank{
					public BOA(double money) {
						super(money);   //calling parent class constructor
					}
				}
				
	


