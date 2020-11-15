package com.syntax.class18;

public class ConstructorIntro {
	
	
	
	//ConstructorIntro() { //default constructor
	//}
	
	
	//to create constructor;  1.no return type (not even void
	//                        2.name must be same as class name
	                     
	
	ConstructorIntro() { //constructor method
		System.out.println("I am a constructor");
		
	}
	 
	
    public static void main(String [] args) {
    	
    
	ConstructorIntro obj = new ConstructorIntro();//making  or calling the constructor call
	
	System.out.println("Code after constructor");
	
	obj.hello(); //calling the hello method	
	
	
    }
	
    void hello () {
    	System.out.println("Hello class");
    	
	
	
    }
	}


