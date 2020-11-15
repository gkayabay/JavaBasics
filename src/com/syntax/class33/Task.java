package com.syntax.class33;

import java.util.*;

public class Task  {
	//Create a static method that will return a List of Exceptions.
	//Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
	//Call your method inside main and print name and details of all Exception objects.
	
	
	public static void main(String[] args) {
	
		List<Exception>list = getAllExceptions(); //call the getAllExceptions method List of Exception type
		System.out.println(list.size());
		
		Iterator<Exception> eit =list.iterator();
		while (eit.hasNext()) {
			//String message = eit.next().getMessage();
			//System.out.println(message);
			eit.next().printStackTrace();  //prints all the exception with name, adress and type
			System.out.println("-----------------------------------------------");
		}
		}
		
	   public static List<Exception> getAllExceptions(){
		   List<Exception> exceptionList = new ArrayList<>();
		   
		   //1st object of exception type
		   int [] array = {1,2,4,5};
		   
		   try {   
		   System.out.println(array[4]); //
		   
	       }catch (ArrayIndexOutOfBoundsException aob) {
	    	   exceptionList.add(aob);
	       }
		   
		   //2nd object of exception type
		   try {
			 Object ob = new Double(50);
			 Integer i = (Integer) ob;
		   }catch (ClassCastException e) {  //e yi variable gibi dusun
			   exceptionList.add(e);   
		   }   
		   
		   
		   
		  //3rd object of exception type
		   int a =10;
		   int b=0;
		   
		   try {
		   System.out.println(a/b);//ArithmeticException
		   }catch (ArithmeticException ae) {
			  exceptionList.add(ae); 
		   }
			   
		   
		   //4th object of exception type
		   
		   try {
			   
			   int [] negArray = new int [-1];   //Array size cannot be  negative
		   }catch (NegativeArraySizeException ne)  {
			   exceptionList.add(ne);
			   
		   }
		    
		 	return exceptionList;
	   }
	
}

		
	


