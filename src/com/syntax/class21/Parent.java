package com.syntax.class21;

public class Parent {
	
	String name = "Farid";
	String lastName = "Smith";
	
	void hello() {
		System.out.println("I am parent class method");
	}
}
class Child extends Parent {	
	
	String name = "Ahmet"; //when you have same variable(name both parent and child class use "super.name" for to be clear
	
	public void display() {
		System.out.println(name);
		System.out.println(super.lastName);
		System.out.println(super.name);//to access the parent class variable
		 
	}
   void sayHello() {
	   display();//calling into my own method.Compiler adds this(by default by compiler will add  invisible))
	   hello(); //calling parent class hello method. compiler adds super(by default compiler will add
       super.hello(); //ayni hello() ile
       
   }
}
