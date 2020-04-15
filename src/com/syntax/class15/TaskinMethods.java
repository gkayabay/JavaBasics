package com.syntax.class15;

public class TaskinMethods {
	
	String name, lastName, emailType;
	String TaskinMethods(String name, String lastName, String  emailType) {
		this.name = name;
		this.lastName= lastName;
		return this.emailType = emailType;
	}


	  
 
	
	
	public static void main(String [] args ) {
		TaskinMethods user1=new TaskinMethods();
		user1.name= "John";
		user1.lastName="Smith";
		user1.emailType= "@gmail.com";
		System.out.println(user1.name+user1.lastName+user1.emailType);
	}
}
