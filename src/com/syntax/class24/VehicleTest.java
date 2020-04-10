package com.syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		//new Vehicle ("yellow);
		//new Car("sedan","yellow");
		
		Vehicle tesla = new Tesla("yellow", "sedan","tesla");
		tesla.drive();//tesla will execute
		tesla.stop();
		tesla.brake();
		tesla.start();
		//tesla.display(); CE: method is not defined in Vehicle 
	
        new Toyota ("red","sedan", "toyota");
        new Toyota ("blue","sedan","toyota");
        Vehicle.total();
	}

}  
