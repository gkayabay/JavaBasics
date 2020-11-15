package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW2 {

	public static void main(String[] args) {
		//HW2 Create a Map from array of cities that will sort keys in alphabetical order.
		//As a key store the name of the city and as a value store the length of the city 
		//(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
		//If any city name is more than 7 characters remove that city . 
		
		Map<String, Integer> cities = new TreeMap<>();
		cities.put("Boston", 6);
		cities.put("Acton", 5);
		cities.put("Newton", 6);
		cities.put("Allston", 7);
		cities.put("Cambridge", 9);
		cities.put("Manchester", 10);
		
		System.out.println(cities);
		
		Set<Entry<String, Integer>> entry =  cities.entrySet();
		Iterator<Entry<String,Integer>>it = entry.iterator();
		while(it.hasNext()) {
			String city= it.next().getKey();
			if(city.length()>7) {
				it.remove();
			}
		}
			System.out.println(cities);
			}
		}
	
		
	
