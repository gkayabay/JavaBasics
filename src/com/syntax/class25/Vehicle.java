package com.syntax.class25;

public abstract class Vehicle {

	static int totalVehicles;
	
	String color; //if we have instance variable we can have constructor and have it initialize
	
	Vehicle(String color) {
		this.color = color;
		totalVehicles++; //count total vehicles everytime vehicle is created 
	}
	public static void total() { //static method can be inside of abstract class
		System.out.println("we build "+totalVehicles);
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	public void stop() {
		System.out.println("Vehicle stops");
	}
    abstract void start();
	
	//abstract void start (String help);
	
	public abstract void brake();
	
	//can abstract method be static ? NO
	//exp. public abstract static void m1();
	
	//can abstract method be final ? NO
	//exp.public abstract static void m2();
	
	//can abstract method be private? NO
	//exp. private abstract void m3();
}

class Bus extends Vehicle {
	
	Bus(String color) {
		super(color);
		
	}
	@Override
	public void brake() {
		System.out.println("Bus should breake at red light camera");
	}
	@Override
	void start() {
		System.out.println("Bus can start easily");
	}
}

abstract class Car extends Vehicle {
	
	String carType;     //can as a child has feature yes. Its own feature
	
	Car(String color, String carType) { //define the constructor
		super(color); //define parent constructor
		this.carType= carType; //added car type feature
	}
	public void brake () {
		System.out.println(carType+ " have breaks");
	}
}
class Tesla extends Car {
	
	String make;
	
	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	public void drive() {
	   System.out.println(make+ " drives on autopilot");
	}
  
	@Override
	public void start () {
		System.out.println(make+ " starts remotely");
	}
	public void display() {//my own method i can have
		System.out.println("We have "+ color+" "+make+" "+carType);
	}
}
class Toyota extends Car {
	
	String make;  //my own feature
	
	Toyota (String color, String carType, String make) {
		super(color, carType);
		this.make= make;
	}
	@Override
	public void start() {
		System.out.println(make+ "starts keyless");
		
	}
}
 
