package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {

	
	
	public static int division (int num, int num1) {
		
		int result = 0;
		
		try {
			result = num/num1;   //new ArithmeticException();
			System.out.println(result);
			
		}catch (ArithmeticException ae){
			//ae.printStackTrace();    //detailed message of an exception
			//System.out.println(ae.getMessage());  //message of an exception
			System.out.println(ae);
		}finally {
			System.out.println("I am finally block");
		}
		return result;
			
		}
	    
	    public static void read(String filePath) { //we will read property file
	    	
	    	FileInputStream  fis = null;    //decleare FileInputStream 
	    	
	    	try {
			    fis = new FileInputStream(filePath); //initialize FileInputStream fis 
				Properties prop = new Properties();
				prop.load(fis);
				
			} catch (FileNotFoundException e) {  //line 34 dan geleni catch yapar
				e.printStackTrace();
			} catch (IOException e) { //line 36 dan geleni catch yapar
				e.printStackTrace();
			}finally {
				try {
					if(fis !=null) {  //to eliminate null point exception. 
					fis.close();   //if fis is null how you can close is happening. fis.close() can be written line 39 inside after prop.load
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	    }
}
