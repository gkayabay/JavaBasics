package com.syntax.class23;

public  class FinalKeyword {
	

		
	public static String str = "Hello"; //accessing variable without creating object is static way
	public static final String str1= "Bye";	//final variable = CONSTANT
		
	
	public static final String APPLICATION_URL="https://syntaxtechs.com";
	
	
	public static final char GRADE = 'A';
	
	
	
	public static void main(String[] args) {
		
		str = "Hi"; //to access static variable
		//str1 = "Good Bye"; CE; because cannot change the final value of st1;
			
		//applicationURL="https://google.com" (it is final variable cannot changed to google
	}
	
	public final void hello () { //final keyword cannot override
		System.out.println("I am a final method");
	}
	public final void hello(String name) {
		System.out.println("Hello "+name);
	
}

class SubClass extends FinalKeyword {
	
	// public final void hello() { CE: cannot oerride final method
		
	}
    
public void hello (int num) {//not overriding (method signature is different ) it is a new method in different class
	System.out.println("Hello of child class ");
}
	
	
	
	
	
	
	
	
	
	
	
	

}
