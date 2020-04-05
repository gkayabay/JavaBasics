package com.syntax.class22;

public class Student {
	//HW 1-Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
	
	public void study() {//overrided method
		System.out.println("Student study.");
	}
	public void hasTest() {
		System.out.println("Student takes test.");
	}
	public void classOnline() {//overrided meethod
		System.out.println("Student takes class online");
	}
}
	
	
	class SyntaxStudent extends Student {
		
	public void study() { //overiding method
		System.out.println("Syntax students study more.");
	}
	public void classOnline() {
		System.out.println("Syntax student takes classes online now.");
	}
	}
	
	
	
	class CollegeStudent extends Student {
	public void outOfState() {
		System.out.println("College student lives outside of state.");
	}
	public void payTuition() {
		System.out.println("College student pays high tuition");
	}
	public void classOnline() {
		System.out.println("College student takes classes online .");
	}
	
	}
	
	
	
	class SchoolStudent extends Student {
	public void earlyBird() {
		System.out.println("School students are early bird!");
	}
	public void lovesArt() {
		System.out.println("School students love Art class");
	}
	public void study() { //overriding method
		System.out.println("School student study.");
	}
	}
	
		
	
