package com.oops;

public class TestConstructor {
	
	public static void main(String[] args) {
		
	Animal horse = new Horse();
	
	Animal horse1 = new Horse("Arabian");
	
	Horse horse2 = new Horse("brown", 12, 850, "Irish");
	
	System.out.println(horse2.breed);
	
	}
}
