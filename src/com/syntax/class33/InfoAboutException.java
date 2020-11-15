package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		try {
			char character = str.charAt(10);// will create new StringIndexOutOfBoundsException(); 
			
			System.out.println(character);
			
		}catch ( StringIndexOutOfBoundsException se) {
			//to get info about the exception
			
			//gives name, message about E, where it occurs
			//se.printStackTrace(); // gives: name, message about Exception, where it occurs
			//System.out.println(se); //directly calling and gives:  name, message about Exception
			System.out.println(se.getMessage()); //gives only message
		}
		System.out.println("------------------End of The Program-----------------");
	}

}
