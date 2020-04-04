package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall () {
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str) { //calling constructor inside another method
	this();  //you are calling current class constructor that does not accept any parameter
	}
	
	public ConstructorCall(String str, String str1) {
	this("Hello"); //this("Str", "str"):CE error   and this(12);CE error
	}              //this(str) yazilabilir cunki str nin degeri Java
	
	public static void main(String[] args) {
		//creating an Object by passing 2 String values
		ConstructorCall obj =new ConstructorCall("Java","Love"); //ilkonce main method a gelir sonra matching constructor i bulur ayni nested for loop gibi
	}
	 
	}
   
