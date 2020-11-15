package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		//Create an arraylist of cars and retrieve all the values using 3 different ways.
        //Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("Corvet");
		cars.add("Toyota");
		
		//1st way enhanced loop
		for(String c:cars) {
		System.out.println(c);
		}
		
		//2nd way regular for loop
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		//3 way with iterator
	    Iterator <String> it = cars.iterator();	
	    while(it.hasNext()) {
	    	String element = it.next();
	        System.out.println(element);
		
	    }
	    
	    
	     //Task 2 // Create an arrayList of words. 
	     //Remove every word that ends with “e”. Use iterator
 
			ArrayList<String> greetings = new ArrayList<>();
			greetings.add("Hello");
			greetings.add("Merhaba");
			greetings.add("As-salam alaykom");
			greetings.add("Hola");
			greetings.add("Zdravstvuyte");
			
			Iterator<String> greetings2 = greetings.iterator();
			
			while (greetings2.hasNext()) {
				if (greetings2.next().endsWith("e")) {
					greetings2.remove();
				}
			}
			System.out.println(greetings);
		}
	}
	    
	
