package com.Review08.Polymorphism;

public class Turkish extends Human  { // inheritance 
    
	public Turkish(String name) {
	    super(name);     //to call parent constructor
	
	}
	@Override
	public void talk () {
		System.out.println(name+ " says merhaba diyor!");
	}
	public void makeBaklava() {
		System.out.println("I am making baklava");
	}
	
	
	
	}	

