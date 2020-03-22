package com.syntax.class14;

public class Dog {
	
	String name;
	String color;
	String breed;
	int age;
	
	public static void main (String []args ) {   //main method (anything we execute has to be in main method
		Dog dog1=new Dog(); //create new object
		dog1.breed="GermanShepherd";
		dog1.color="BlackAndWhite";
		dog1.name="Silver";
		dog1.age= 3;
		
		dog1.bark();
		dog1.eat();
		dog1.run();
		
		Dog dog2= new Dog();
		dog2.breed="bulldog";
		dog2.color="Black";
		dog2.name="Silver";
		dog2.age= 5;
		
		dog2.bark(); //it is a method because it has () parantheses. 
		dog2.eat();
		dog2.run();
		
	}
	
	void eat() { //method eat
		System.out.println(name+" can eat");
	}
	void bark () {
		System.out.println(name+" can bark");
	}
	void run () {
		System.out.println(name+" can run");
	}
	
	
}
