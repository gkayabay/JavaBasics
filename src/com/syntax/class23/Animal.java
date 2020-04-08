package com.syntax.class23;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep () {
		System.out.println("Animal sleep");
	}
	private void eat () {
		System.out.println("Animal eat");
	}
}


class Bird extends Animal {

	//@Override //Annotation (checks if it is allowed overriding or not). It is not allowed becuase it is static method not asociated with the object and cannot be overriding 
	public static void whoAmI() {//we are not overriding, this process calls method hiding because it is STATIC method 
		System.out.println("I am a bird");
	}
	
	public void sleep () {
		System.out.println("Bird sleeps");
	}
	private void eat () {
		System.out.println("Birds eat too");
	}
}
	


	

