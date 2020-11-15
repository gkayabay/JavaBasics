package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	
	static String str;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		int a = 10;
		int b = 0;
		
		//System.out.println(a/b);--->ArithmeticException
		
		System.out.println("End of the program");
		
		int [] array = {12,1,13};
	    //System.out.println(array[3]); ---->ArrayIndexOutOfBoundsException

		//System.out.println(str.length()); ---->NullPointerException
		
		//Explicitly create NullPointerException
//		NullPointerException npe = new NullPointerException(); //created obj of NullPointerException and throws(npe)
//	    throw(npe); //this object is thrown into our program
		
		Thread.sleep(2000); //Checked Exception (happens during compile time throws exception)
		
		String filePath ="";//checked exception
		
		FileInputStream fis = new FileInputStream(filePath); //checked exception
		
		
		
	}

}
