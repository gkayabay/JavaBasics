package com.syntax.class23;

public class AnimalTest {
	
public static void main(String[] args) {
	
	Animal animal = new Bird(); //Bird is assigned to the Parent class(Animal Class)
	animal.sleep();
	animal.whoAmI();//not achiving overriding.Achiving method and is hiding. Accesing through the parent class
	
	Animal.whoAmI();//access from parent class 
	Bird.whoAmI();//access from Bird class
	
	
	
}
	
	
	
}
