package com.oops;

public class Horse extends Animal {
	
	String breed;
	
	public Horse() {
		super();
		System.out.println("I am non argument constructor inside Horse class");
	}
	
	public Horse(String breed) {
		this.breed = breed;
		System.out.println("Breed is "+ breed);
	}
	
	public Horse(String color, int age, int weight, String breed) {
	//	super(color, age, weight);
	//	this.breed = breed;
		this(breed);
		super.color = color;
		super.age = age;
		super.weight = weight;
	}

}
