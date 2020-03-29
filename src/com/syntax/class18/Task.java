package com.syntax.class18;

public class Task {
	//TAsk 1 Write a program that will have a constructor: one with parameters and 
	//second without any parameters. Create a separate Test class where you will 
	//execute both of the constructors.

	String brand;
	String color;
	int price;
	
	public void printDetail () {
		System.out.println("I have a "+ brand+ " watch in color "+ color+ " and price is "+price);
	}
	
	Task (String WatchBrand, String WatchColor, int WatchPrice) { //constructor with parameter
		brand = WatchBrand;
		color = WatchColor;
		price= WatchPrice;

}
	
	public static void main(String[] args) {
		
		
	Task watch = new Task("Apple", "Green", 750);
	
	Task watch1 = new Task();
	
	watch.printDetail();

	
	}	
	
}
