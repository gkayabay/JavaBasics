package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
	 	
		Computer [] comps = {new Apple("Apple Macbook"),new HP("HP"), new Lenovo("Lenovo"), new Dell("Dell")};
		
		for(Computer c : comps) {
		c.run();
		c.save();
		c.storage();
		c.transfer();
		System.out.println("------------------------------");
		
	 Apple app=new Apple("Apple"); //to call its own method create object 
		
	 //downcasting 
	 //Apple computer = new Computer("Comp")CE; //Not every computer is Apple so expilictly upcast then 
	// Apple applec = (Apple)new Computer("Computer");first upcast then downcasting
	}
	
	SmartMachine sm = new HP("HP");
	sm.smart();
}
}