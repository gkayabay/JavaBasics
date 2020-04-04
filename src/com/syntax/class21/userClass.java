package com.syntax.class21;

public class userClass {

	//Task1 Write program: userClass  that has a constructor 
	//that initializes instance variable name and mobile number. 
	//Create a subclass  userInfo that will have user address variable and
	//it also being initialized through constructor call. 
	//Print users name, mobile number and address in userDetails method. Test your code.
	
	String name;
	String mobileNumber;
	
    userClass(String name, String mobileNumber) {
    	this.name= name;
    	this.mobileNumber= mobileNumber;
    	
    	
    }
}
    
	  class userInfo extends userClass {
		
		String adress;
		
		userInfo(String name, String mobileNumber, String adress) {
			super(name, mobileNumber);
			//this.name=name;
			//this.mobileNumber;
			this.adress=adress;
		}
		 void userDetails() {
			System.out.println(name+" "+mobileNumber+" "+adress);
		 }
	   
	  }
