package com.Review08.Abstraction2;

public class Orange extends Fruit implements Peelable {
	
	public Orange (String color) {
		
		super(color);
}
	
	public void eat () {
		peel(); //peel() method in eat method (method in method). Peel first then eat
		System.out.println("Eating the orange");
	}

	@Override
	public void peel() {
		System.out.println("Let`s peel the orange");
		
	}
	
	
	
	}
	

