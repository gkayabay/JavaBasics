package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {

	//3. Create an arrayList of drinks. 
	//If any drink has letter “a” or “e” replace it with water.
	
	ArrayList<String> drinks = new ArrayList<>();
	
	drinks.add("Cherry Juice");
	drinks.add("Lemon Tea");
	drinks.add("Salgam");
	drinks.add("Coffee");
	drinks.add("Boza");
	
	Iterator<String> it = drinks.iterator();
	
	while(it.hasNext()) {
		String element = it.next();
		
		if(element.contains("a") || element.contains("e")) {
			String str = element.replaceAll(element, "water");
			System.out.println(str);
		}
	}
	}
}

