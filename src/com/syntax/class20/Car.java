package com.syntax.class20;

public class Car {
	
	String make, model;

	public Car() { //constructor can have access modifier
		System.out.println("I am parent class constructor");
	}
	public Car(String make, String model) {
		this.make=make;//initilaize happens
		this.model=model;
	}
}


class Mercedes extends Car { //constructors are not partifipate inheritance it will have own constructor
	
	String sportModel;
	
	public Mercedes() {
		//super();//compiler add super()by default to the parent class constructor
		System.out.println("I am a child class constructor");
	}
	
	public Mercedes(String make, String model, String sportModel) {
		super(make, model);//to call to our parameritized constructor. super refers to the immediate constructor(Car constructor here)
		this.sportModel= sportModel;//as soon as Java sees super keyword jumps to the immediate constructor(Car constructor) and keeps going
		//NOte(this:I am in the Mercedes class and initiliaze sportModel )
	}
	
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel); //have an access to the child class
	}
}