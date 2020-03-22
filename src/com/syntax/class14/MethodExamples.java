package com.syntax.class14;

public class MethodExamples {
	//create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Sarmed");
	}
	public static void main(String[] args) {
		//how do i call method greet? ---->first create an object of the class 
		//where that method belongs
		//className variableName =new Classname();
		
		MethodExamples object1 = new MethodExamples();
		object1.greet();
		
		
	}
	
	
	

}
