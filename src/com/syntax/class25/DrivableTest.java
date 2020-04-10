package com.syntax.class25;

public class DrivableTest {
	
     public static void main(String[] args) {
	
    Drivable obj = new Cars();//create the object of child first then store in to obj 
    	obj.drive(); 
         //Drivable.MOVE_FAST = false;
    	Cars car = new Cars();
    	car.drive();
    	car.stop();
    	
}
}
