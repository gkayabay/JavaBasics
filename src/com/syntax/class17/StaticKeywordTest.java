package com.syntax.class17;

public class StaticKeywordTest {
	
	public static void main(String [] args) {
	
	//access static members of another class 
	
	StaticKeyword.brand= "Android";
	StaticKeyword.touchScreen= true;
	StaticKeyword.displayGeneralInfo();//calling static method because displayGenInfo is staticmethod
	
	//access instance members of another class
	StaticKeyword sk = new StaticKeyword();
	sk.color = "red";
	sk.memory = 128;
	sk.displaySpecifications(); //calling method
	
	StaticKeyword sk1 = new StaticKeyword();
	sk1.color = "red";
	sk1.memory = 128;
	sk1.displaySpecifications(); //calling method
	
	
	StaticKeyword sk2 = new StaticKeyword();
	sk2.color = "red";
	sk2.memory = 128;
	sk2.brand="Nokia"; //brand will change for all instances(object)
	
	
	//not the right way access static method
	sk1.displayGeneralInfo();
	sk.displayGeneralInfo();
	}
}
	
	


