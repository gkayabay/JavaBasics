package com.syntax.class29;

import java.util.*;

public class Country {

	public static void main(String[] args) {
//Task1 Create a Set collection in which you need to add names of the countries. 
//In this set we want all objects to be sorted in alphabetical order. 
//Using 2 different ways retrieve all elements from set.
		
	Set<String> country = new TreeSet<>();
	country.add("USA");
	country.add("Turkey");
	country.add("Mexico");
	country.add("Canada");
	country.add("New Zeland");
	
	System.out.println(country);
	
	Iterator<String> it = country.iterator();
	while(it.hasNext()) {
		System.out.print(it.next() +" ");
	}
	
	System.out.println("------------------------------------------------");
//Task2 Create a Set of cities in which you want to make sure that insertion order is 
//maintained. Using Iterator remove any city that starts with “A”;	
	
	Set<String> city = new HashSet<>();
	city.add("Istanbul");
	city.add("Manhattan");
	city.add("Boston");
	city.add("Cambridge");
	city.add("Newton");
	city.add("Allston");
	city.add("Acton");
	System.out.println(city);
	
	Iterator<String> c = city.iterator();
	while(c.hasNext()) {
		if(c.next().startsWith("A")) {
			c.remove();
		}
	}
		System.out.println(city);
	}
	
	}


