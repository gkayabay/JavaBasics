package com.syntax.class20;

public class CarTest {

	public static void main(String[] args) {
		
		//Car car = new Car();//call to the parent class constructor
			
		System.out.println("---------------");
		
		Mercedes merc = new Mercedes(); //calling to the child class constructor
	    merc.display();	
	    
	    Mercedes merc1 = new Mercedes("Mercedes", "M", "NO AMG");
	    merc1.display();
	    
	    Mercedes merc2 = new Mercedes("Mercedes", "S", "AMG");
	    merc2.display();
	    
	    
	}
	}


