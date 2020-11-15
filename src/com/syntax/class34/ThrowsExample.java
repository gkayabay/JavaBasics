package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {
		
      multipleSleep();
      
		try {
			read("");  
		} catch (FileNotFoundException e) {  //exception is handled by main method by try and catch 
			e.printStackTrace();
		}
		
	System.out.println("--------End of the Code-------------");
	
	
}
	public static void read (String filePath) throws FileNotFoundException { //this issue throws into main method because read() method is called inside main method
		FileInputStream fis = new FileInputStream(filePath); //new FileNotFoundException
	}
	
	
	
	public static void multipleSleep() {  
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void sleep () throws InterruptedException {  //throws-->declearing (throwing the exception), but does not handles issues 
		                                                     //compiler shows 2 possibilty (throws exception)
		Thread.sleep(20000);      //if this method sleep() if will be calling in another method will have throws exception until someone handle it
			

	}

}
