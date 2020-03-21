package com.syntax.class14;

public class Car {
	
	// define feature of the car
	String make;
	String model;
	String color;
	int year;
	int speed;
     
	
	//define behavior
	void drive() {
		System.out.println(make+" Car can drive");
	}
	
	void accelerate() {
		System.out.println(make+" Car can accelerate");
	}
	
	void makeNoise() {
		System.out.println(make+" Car makes noise");
	}
	void stop() {
		System.out.println(make+" Car stops when you press break ");
		System.out.println(make +" car stops");
		
	}
	

}
