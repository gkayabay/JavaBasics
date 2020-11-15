package com.gulbahar.practices;

public class Repl209 {

	public static void main(String[] args)  {
		
		//Create a method that will do temperature check. 
		//Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"

		//In Main method call the method and handle an Exception
		
		
		try {
			tempCheck(28);
		}catch (RuntimeException e){
			System.out.println(e);
		}
			
		}
			
		public static void tempCheck(int temp)  {
			if(temp<32) {
				throw new RuntimeException ("It is freezing");
				
			}
			
		}
		}
		
