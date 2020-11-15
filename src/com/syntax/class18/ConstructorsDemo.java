package com.syntax.class18;

public class ConstructorsDemo {
	
	
	static String str = "Hello";
	
	
	ConstructorsDemo () {  //non argument constructor because no parameters 
		                   //also it is default constructor it does not have parameter 
		                   //when we forget to create compiler will create this default consructor for us
	System.out.println("I am your constructor");
	System.out.println("I am non argument constructor");
	} 
     
	ConstructorsDemo(String str) {
		System.out.println("I am a constructor with 1 string parameter"+ str);
	}
	
	ConstructorsDemo(int num) {
		System.out.println("I am a constructor with 1 integer value ="+ num);
	}
	
	ConstructorsDemo(String str, int num) {
		System.out.println("I am constructor with 2 parameters: "+str+ " & " + num);
	}
	
	void ConstructorsDemo() {//as soon as we add return type -->IT becomes method. It is a void method name ConstructorsDemo
		System.out.println("I do not know who am I");
	}
	
	public static void main(String[] args) {
		
		ConstructorsDemo obj = new ConstructorsDemo();//calling constructor method with no parameter or non argument
		System.out.println(str); //static variable can be access by its name
		
		ConstructorsDemo obj1 = new ConstructorsDemo(" Today is Java Class");//create object and calling ConstructorsDemo() method with a string
	    obj1.ConstructorsDemo();//void ConstructorsDemo method because void is the return type
		
	}
	
	
}
