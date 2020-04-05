package com.syntax.class22;

public class Parent {
	
	Parent() {
		System.out.println("Parent class constructor");
	}
	
	private void hello() {//this method visible to the parent class and it has own its private method
		System.out.println("Hello from parent class");
	}
	static void bye() {
		System.out.println("Bye from parent class");
	}
}
class Child extends Parent {//
	//we are not overriding. We just declaring private method inside child class  
	//@Override (if public void hello then it is overriding but if it is private it cannot override)
	
	Child(){
		System.out.println("Child class constructor");
	}
	
	
	private void hello() {
		System.out.println("Hello from child class");
	}
	//@Override
	//static void bye() {                           We cannot overriding the static method
	//	System.out.println("Bye from child class"); //no overrdiing for private and constructor
	//}

	

}
