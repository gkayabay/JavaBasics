package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall () {
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str) { //calling constructor inside another method
	this();  //you are calling current class constructor that does not accept any parameter
	}
	
	public ConstructorCall(String str, String str1) {
	this("Hello");
	}
	public static void main(String[] args) {
		//creating an Object by passing by 2 String values
		ConstructorCall obj =new ConstructorCall("Java", "Love"); 
	}
	
	}

