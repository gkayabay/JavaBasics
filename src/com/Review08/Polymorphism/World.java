package com.Review08.Polymorphism;

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
		
		
		//upcasting/widening/implicitly
		Human b1 = new Belarusian("Vitali"); 
		b1.talk();
		//bela.pickMushrooms();
		
		Human h3 = b1; //b1 is stored into h3 (stored as a Human
		h3.talk();
		
		//downcasting/narrowing/explicitly
		Belarusian bela = (Belarusian)b1; //b1 converted into Belarusian and stored into Belarusian downcasting first
		bela.talk();
		bela.pickMushroom();
		
		//Turkish tur = (Turkish)b1;//cannot converted b1 intto Turkish will throw an exception
		
		
		Belarusian b2 = new Belarusian("Mahboobullah");
		
		
		System.out.println("--------Now People are Talking-------");
		h1.talk();
		h2.talk();
		t1.talk();
		b1.talk();
		
		
		System.out.println("-----Purpose of upcasting----------------");
		//purpose of upcasting 
		Human [] people = new Human [5];
		people[0] = h1; //h1 was stored in 1st index element
		people[1] = h2; //h2 was stored in the 2nd index
		people[2] = t1;
		people[3] =b1;
		people[4] = new Turkish("Veli"); //upcasting.  creating an object and putting into array list
		people[5] =new Belarusian("Olga");//upcasting
	
	    for (Human person:people) {//created array of people
	    	person.talk();
	    	
	    	
	    	if (person instanceof Belarusian) {//if the object(person) is of type Belarusian
	    	Belarusian belarus = (Belarusian) person;
	    	belarus.pickMushroom();
	    	} else if (person instanceof Turkish) {
	    		Turkish turk = (Turkish) person;//if the object(person) is type of Turkish than you can convert into downcasting
	    		turk.makeBaklava();
	    	}
	    	
	    }
	}
	

}
