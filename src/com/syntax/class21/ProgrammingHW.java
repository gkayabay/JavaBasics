package com.syntax.class21;

public class ProgrammingHW {
	
	//Task1 -Create a class named ‘Programming’. While creating an object of the class, 
	//if nothing is passed to it, then the message “I love programming languages” should be printed. 
	//If some String is passed to it, then in place of “programming languages” the value variable should be printed. 
	//Example, if we pass “Java”, then “I love Java” should be printed.
	String str;
	
	ProgrammingHW() {
		System.out.println("I love programming languages");
	}
    ProgrammingHW(String str) {
    	this.str=str;
    	System.out.println("programming languages");
    }
    
    public static void main(String[] args) {
		//Task1
    	ProgrammingHW obj = new ProgrammingHW ();
    	ProgrammingHW obj1 = new ProgrammingHW ("Java");
    	
    	//Task2 
    	ProgrammingHW obj2 = new ProgrammingHW();
    	obj2.mult(19.2, 20.2);
    	obj2.mult(12, 32, 20);
    	obj2.mult(25, 4, 20,40);
    	
    	//Task 3
    	ProgrammingHW obj5 =new ProgrammingHW();
    	obj5.display("Sofiya","6th grader goes to ", "Framingham Middle School.");
    	obj5.display(10, "students partcipated in the project from ", "Framingham High School");
    	obj5.display("Jayden is ", "a kindergartener.");
    }
    
    //Task 2-Create 1 class with a static method that has 3 overloaded forms. 
    //Then call each overloaded method with specific arguments and observe result.
    
     static void mult(int num1, int num2,int num3,int num4) {
    	 System.out.println(num1*num2*num3*num4);
     }
     static void mult(int num1, int num2,int num3) {
    	 System.out.println(num1*num2*num3);
     }	 
     static void mult(double num1, double num2) {
    	 System.out.println(num1*num2);
     }
     
    
     //Task 3 Create 1 class with a private method that has 3 overloaded forms. 
     //Then call each overloaded method with specific arguments and observe result.
      
    private static void display (String name, String grade, String school) {
    	System.out.println(name+" "+grade+" "+school);
    }
    private static void display (int num, String students, String school) {
    	System.out.println(num+" "+students+" from "+school);
    }
    private static void display (String name, String grade) {
    	System.out.println(name+" "+grade);
    } 
}
