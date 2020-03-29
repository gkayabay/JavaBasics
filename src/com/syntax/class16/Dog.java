package com.syntax.class16;

public class Dog {
	//instance varibles
	String name, size;
	int age;
	
	//static variables
	static String breed ="Husky";
	static int paws= 4;
	static int tail= 1;
	static int eyes=2;
	
	void displayDog() {
		System.out.println("Dog name is "+name+" and it is "+size+" dog and age is "+age);
	System.out.println("Dogs breed is "+breed + "and it has "+paws+"paws and "+tail+" tail");
		
	}
	
	public static void main(String[] args) {
		
	Dog	dog1 = new Dog();//create an object dog1
	//how to access instance variables--->by creating an object and using refernce variable
	
	dog1.name= "Lucy";
	dog1.size= "Big";
	dog1.age=5;
	
	dog1.displayDog();
	
	//how to access static variables--->static variables belong to the class -->accessed by className
	System.out.println(Dog.breed);
	System.out.println(Dog.paws);
	System.out.println(dog1.breed);//access static variables in static way
	System.out.println(breed);//access static variable
	
	//changing value of static variable
	breed="Bulldog";
	
	
	
	
	System.out.println("Dog 1 name is "+ dog1.name);
	
	Dog	dog2 = new Dog();//create object dog2
	dog2.name= "Sharik";
	dog2.size= "Small";
	dog2.age=2;
	dog2.displayDog();
	
	Dog	dog3 = new Dog();//create object dog3
	dog3.name= "Pepsi";
	dog3.size= "Big";
	dog3.age=10;
	dog3.displayDog();
	
	
	
	
	System.out.println("Dog 2 name is "+ dog2.name);
	
	
	
	}
	
	

}
