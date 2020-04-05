package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer[] comps = {new Apple("Apple Macbook"),new HP("HP"), new Lenova("Lenova")}
		
		for(Computer c : comps) {
		c.run();
		c.save();
		c.storage();
		c.transfer();
		System.out.println("------------------------------");
		
	 Apple app=new Apple(); //to call its own method create object 
		
	 //downcasting 
	 //Apple applec = new Computer("comp")CE; //Not every computer is apple so expilictly upcast then 
	// Apple applec = (Apple)new Computer("Computer");first upcast then downcasting
	}
	
	SmartMachine sm = new HP("HP");
	sm= smart();
}
