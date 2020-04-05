package com.syntax.class23;

public class Computer {
	//Task1- Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	//Define common behavior within and some fields in parent class and override 
	//some of the methods in child classes
    //Define some methods specific to child classes
	//Create objects of child classes and store them into array.
	//Loop through each object and execute available methods.
	
	public void smart() { //adding grandparent class 
		System.out.println("I am a smart machine");
	}
	
	
	
	String make;
	
	public Computer (String make) {
		this.make= make;	
	}
	public void display() {
		System.out.println("I have "+ make);
	}
	
	public void opensWith() {
		System.out.println(make+" starts by fingertouch key");
	}
}

class Apple extends Computer {
	public Apple(String make){ 
		super(make);//expilicity create super
	}
	
	public void display() { //overriding method happened in 3 different classes
		System.out.println("I have "+make);
	}
	 public void opensWith() {
		 System.out.println(make+ " opens with fingertouching key");
	 }
	 public void makeVideo() {
		 System.out.println(make+ " easily creates videos.");
}
}	 
class Lenova extends Computer {
	public Lenova(String make){ 
		super(make);//expilicity create super
	}
	public void display() { //overriding method happened in 3 different classes
		System.out.println("I have "+make);
	}
	 public void opensWith() {
		 System.out.println(make+ " opens with password key");
	 }
}



class HP extends Computer {
	public HP(String make){ 
		super(make);//expilicity create super
	}
	
	public void display() { //overriding method happened in 3 different classes
		System.out.println("I have "+make);
	}
	 public void opensWith() {
		 System.out.println(make+ " opens with password key");
	 }
}
	
class Dell extends Computer {
	public Dell (String make){ 
		super(make);//expilicity create super
	}
	
	public void display() { //overriding method happened in 3 different classes
		System.out.println("I have "+make);
	}
	 public void foldable() {
		 System.out.println(make+ " is foldable laptop");
	 }
}

