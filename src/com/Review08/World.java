package com.Review08;

public class World {
	
	public static void main(String[] args) {
		
		Human h1 = new Human ("Turker");
		System.out.println("The best student is "+h1.name);
		
		Human.planet = "World";
		
		Human h2 = new Human ("Gulbahar");
		System.out.println(h2.name+" lives in "+h2.planet);
		System.out.println(h1.name+" lives in "+Human.planet); //Human.planet static variable call yapmak iicn 
		
		
		Human t1 = new Turkish("Ali");
		System.out.println(t1.name+ " lives in "+Human.planet);
		
		
		
		Belarusian b1 = new Belarusian("Vitali");
		b1.talk();
		b1.pickMushroom();
		
		Human h3 = b1; //b1 is stored into h3 (stored as a Human
		h3.talk();
		
		System.out.println("--------Now People are Talking-------");
		h1.talk();
		h2.talk();
		t1.talk();
		b1.talk();
		
		
	}
	

}
