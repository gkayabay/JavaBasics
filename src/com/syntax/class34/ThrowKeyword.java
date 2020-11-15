package com.syntax.class34;

class BalanceException extends RuntimeException {
	
	public BalanceException (String message) { //constructor
	     super(message);	   //calls parent constructor
}
}
public class ThrowKeyword {

	public static void main(String[] args) {  //throw --->we can create out custom exception by throw keyword
		
		NullPointerException npe = new NullPointerException (); //created object of new NullPointerException and 
		
		//throw npe ;                                          //we throw expilicitly the obj of the exception type  
		
		//throwException();
		
		withdraw(100, 1000);
		
		browser("hhvhjcgcm");  

	}
	
	
	
	//create a withdraw method for balance and amount 
	public static void withdraw(int balance, int amount) {   
		
		if(amount>balance) {                                      //BalanceException exception is custom(we created expilictly) 
			throw new BalanceException("Your balance is too low");  //if the validation does not pass, create an exception and explicitly throw
		}
	}
	
	
	

	public static void throwException () {
		throw new ArithmeticException();    //creating and exception and we expilictly throwing it
	}
	
	
	public static void browser(String browser) {
		
		switch(browser) {
		case "chrome":
			System.out.println("Using chrome browser");
			break;
		case "firefox":
		System.out.println("using firefox browser");
		    break;
		default:   //if none of these then throw exception 
			throw new RuntimeException ("Invalid browser");  //you can create your custom class exception as well
			
		}
	}
	
	
	
	
}
