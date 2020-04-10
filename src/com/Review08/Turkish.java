package com.Review08;

public class Turkish extends Human  { // inheritance 
    
	public Turkish(String name) {
	    super(name);     //to call parent constructor
	
	}
	@Override
	public void talk () {
		System.out.println(name+ " says merhaba diyor!");
	}
	private void makeBaklava() {
		System.out.println("I am making baklava");
	}
	
	
	
	}	

