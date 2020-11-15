package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {
		
		try { //If this happens how you want to handle
			Thread.sleep(2000); //compiler throws checked exception and give suggestion like try and catch
		}catch (InterruptedException e) { //catch the object of exception
			System.out.println("Catched Interruppted Exception ");
		}
		
		System.out.println("Continue to next try block");
		
		
		
		
		String fPath ="";
		
		try {
			FileInputStream fis = new FileInputStream(fPath); //pass the data into fileinput
		
		}catch (FileNotFoundException fne) { //we have to catch it into a specific block
			System.out.println("Catched FileNotFoundException Exception ");	
		}
		System.out.println("Continue to next try block");
		
		
		
		
		
		int a = 10;
		int b = 0;
		
		try { 
			//inside here only problemetic codes has to be here
			System.out.println(a/b);//--> when exception occurs, new ArithmeticException is created (will get thrown)
			System.out.println("I am code inside try block");//this block will get ignore if exception occurs
			
		}catch (Exception ae) {   //type of exception (we can specify parents like, Throwable, RuntimeException etc.
			System.out.println("Catched ArithmeticException  Exception");
		}
		
		System.out.println("End of the program");
		
	}

}
