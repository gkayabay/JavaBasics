package com.syntax.class23;

 class SmartMachine {
	//Task1- Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	//Define common behavior within and some fields in parent class and override 
	//some of the methods in child classes
    //Define some methods specific to child classes
	//Create objects of child classes and store them into array.
	//Loop through each object and execute available methods.
	
	public void smart() { //adding grandparent class 
		System.out.println("I am a smart machine");
	}

 }
	
	public class Computer extends SmartMachine  {
		
		String brand;	
	
	public Computer (String brand) {
		this.brand=brand;
	}
	
	public void run() {
		System.out.println(brand+" can run the system");
	}

	public void save () {
		System.out.println(brand+" can save input");
	}

	public void transfer() {
		System.out.println(brand+" can transfer information");
	}

	public void storage() {
		System.out.println(brand+" can store input");
	}
	
}

class Apple extends Computer {
	public Apple(String brand){ 
		super(brand);//explicitly create super
	}
	
	public void run() { //overriding method happened in 3 different classes
		System.out.println(brand+" can run the system faster");
	}
	 public void save() {
		 System.out.println(brand+ " saves input in different way");
	 }
	 public void transfer() {
		super.transfer();
}

     public void safe() {
			System.out.println(brand+" is safer");
		}
		
}	 
class Lenovo extends Computer {
	public Lenovo(String brand){ 
		super(brand);//expilicity create super
	}
	public void run() { //overriding method happened in 3 different classes
		super.run();
		transfer();
	}
	
}

class HP extends Computer {
	public HP(String brand){ 
		super(brand);//expilicity create super
	}
	
	public void run() { //overriding method happened in 3 different classes
		System.out.println(brand+ " runs slower than other computers");
	}
	 public void safe() {
		 System.out.println(brand+ " is safe as Dell");
	 }
}
	
class Dell extends Computer {
	public Dell (String brand){ 
		super(brand);//expilicity create super
	}
	
	public void save () {
		super.save();
		storage();
	}
}

