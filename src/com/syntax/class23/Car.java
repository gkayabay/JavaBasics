package com.syntax.class23;

public class Car {

	String make; //define instance variable
	
	public Car (String make) {
		this.make= make;	
	}
	
	public void display() {
		System.out.println("I have "+ make);
	}
	
	public void start() {
		System.out.println(make+" starts by turning key");
	}
}

class BMW extends Car {
	public BMW(String make){ 
		super(make);//expilicity create super
	}
	
	public void start() { //overriding method happened in 3 different classes
		System.out.println(make+" starts by pushing button");
	}
}



class Mercedes extends Car {
	public Mercedes(String make){ 
		super(make);//expilicity create super
	}
	
	public void start() {
		System.out.println(make+" starts by remotely");
	}
}


class Tesla extends Car {
	public Tesla(String make){ 
		super(make);//expilicity create super
	}
	
	public void start() {
		System.out.println(make+" starts by voice command");
	}
}


class Honda extends Car {
	public Honda(String make){ 
		super(make);//expilicity create super
	}
	
}


