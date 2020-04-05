package com.syntax.class22;

public class AnimalTest {
	
	public static void main(String[] args) {
		//Non primitive casting :upcasting
		Animal obj= new Tiger(); //create obj of child class //upcasting Tiger and widening happens here. is the child of animal class 
		obj.sleep();
		obj.eat(); //goes inside object(Tiger) class and java execute the method based on object type
	//	obj.run();CE: method run() is undefined in Animal class(cunki Tiger Class)
		
		
		System.out.println("-------Accessing Method using Parent Class------");
		Animal animal = new Animal();
		//method only of parent class will be avaliable
		animal.eat(); //animal parent will gets its own methods
		animal.sleep();
		
		System.out.println("-------Accessing Method using child Class------");
	
		 Tiger tiger = new Tiger(); 
		 tiger.sleep();
		 tiger.eat(); //--> calling overriding method
		 tiger.run();
			
}
	
	

}
