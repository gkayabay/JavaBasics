package com.syntax.class14;

public class Dogg {
    
	String breed;
	String name;
	int age;
	
	public static void main (String [] args) {
		Dogg dog1 =new Dogg();
		dog1.breed="Husky";
		dog1.name="Henry";
		dog1.age= 7;
		
		dog1.bark();
		dog1.feel();
		dog1.run();
		
		Dogg dog2 =new Dogg();
		dog2.breed="Bulldog";
		dog2.name="Bill";
		dog2.age= 5;
		 
		dog2.bark();
		dog2.feel();
		dog2.run();
		
		Dogg dog3 =new Dogg();
		dog3.breed="Labrador";
		dog3.name="Lily";
		dog3.age= 13;
		
	}
	void bark () { //method eat
		System.out.println(name+" can bark");
	}
	void feel () {
		System.out.println(name+" can feel");
	}
	void run () {
		System.out.println(name+" can run");
	}
	
}
