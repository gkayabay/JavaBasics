package com.oops;

public class Animal {

	String color;
	int age, weight;
	
	public Animal() {
		System.out.println("I am non argument constructor inside Animal class");
	}
	
	public Animal(String color, int age, int weight) {
		this.color = color;
		this.age= age;
		this.weight=weight;
	}
	
}
