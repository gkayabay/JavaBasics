package com.syntax.class34;

public class Task {

	public static void main(String[] args) {
	
		ageElligible(14);
		
		checkUserName("gulbahar");
	
	}
		public static void ageElligible (int age) {
			
			if(age<16) {
				throw new RuntimeException("You are too young to get driver license"); 
			
		}
		}
			
	//TASK 2. Create a method checkUserName that will throw a runtime exception. 
	//Method should throw an exception when entered username is less than 5 characters.		
	       
		public static void checkUserName(String userName) {
			
			if(userName.length()<5) {
				throw new RuntimeException("Sorry your name contains less than 5 caharacters");
			}else {
				System.out.println("Try name that has more than 5 caharacters");
			
			
		}
		
		}
}
