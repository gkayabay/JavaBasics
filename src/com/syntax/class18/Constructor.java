package com.syntax.class18;

public class Constructor {
	
	//TASk2 in class- create a prog that will have 4 different access levels of constructors and create 3 objects 
	//of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different 
	//package  and observe result.
	//CE: saying invalid modifier
	//static constructor
	
	 
	public Constructor(){
		System.out.println("Public constructor");
	}
	Constructor(int num){
		System.out.println("Default constructor");
	}
	protected Constructor(int num, int num1) {
		System.out.println("protected constructor");
	}
	private Constructor(String str) {
		System.out.println("Private constructor");
	}
	
	public static void main(String[] args) {
		Constructor obj =new Constructor();
		Constructor obj1 =new Constructor(12);
		Constructor obj2 =new Constructor(12, 13);
		Constructor obj3 =new Constructor("Hi");
	}
}
	
	
	
	
	
	
	
	