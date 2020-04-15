package com.syntax.class25;
 
public interface Drivable {
	 //compiler by default adds public static final variables
	 final boolean MOVE_FAST = true;
     
	 //compiler by default adds public abstract 
	  void drive();// = public abstract void drive //(for drivable i have to implement this method in Cars class)
     }
 abstract class Vehicles { //I can create regular class as well
	
	abstract void stop();
 }
 
//achieving multiple inheritance
class Cars extends Vehicles implements Drivable { //Car is a type of Vehicle ND DRIVABLE

	@Override
	public void drive() {  //implementation of this drive method 
		System.out.println("Car drives");
	}

   @Override
    public void stop() {  //this method came from Vehicles(
	System.out.println("Car stops");
	
}
	
}
