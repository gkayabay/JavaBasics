package com.Review08;

public class Belarusian extends Human {

	public Belarusian(String name) {
		super(name);
	}
	
	
	@Override  //run time polymorphism
	public void talk() {
		System.out.println(name +" vitaju! ");//hello in Belarusian
	}
	public void pickMushroom() {
		System.out.println(name+ " is picking mushrooms!");
	}
}
