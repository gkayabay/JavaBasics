package com.syntax.class23;

public class AnimalTest {
	
public static void main(String[] args) {
	
	Animal animal = new Bird(); //Bird is assigned to the Parent class(Animal Class)
	animal.sleep();//Object bird decides runtime. First, If Bird (-) have sleep method then it goes to parent method
	animal.whoAmI();//not achiving overriding because STATIC method.Achiving method and is hiding. Accesing through the parent class
	
	Animal.whoAmI();//access from parent class 
	Bird.whoAmI();//access from Bird class
	
	
	
}	
}
