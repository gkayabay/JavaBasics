package com.syntax.class19;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog= new Dog();
		//access variables from own class 
		dog.breed = "Husky";
		//access variables from parent class
		dog.color = "Grey";
		dog.fur = "Too much";
		dog.size = "Big";
		
		//access method from own class
		dog.bark();
		//acess method from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		Dog.age =2;//accessing static variable -->classname.varaible
		Dog.display();//accessing static method-->classname.method
		
		//access variable from own class
		Cat cat = new Cat();
		cat.bigEyes = true;
		//access variable from parent class
		cat.color="White";
		cat.fur="Some";
		cat.size="Small";
		
		//access method from own class
		cat.play();
		
		//access variable from parent class
	    cat.beWild();
		cat.eat();
		cat.sleep();
		
		
		System.out.println("----accessible through the animal class---");
		
		Animals animal = new Animals();
		//can access only features define within it is own class
		animal.color = "Any";
		animal.size = "Any";
		animal.fur = "Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		
	}

}
