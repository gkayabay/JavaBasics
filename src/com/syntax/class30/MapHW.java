package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {
	public static void main(String[] args) {

		// Entries with duplicate keys and values
		Map<Integer, String> building = new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Apple");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "Apple");
		building.put(6, "Google");
		building.put(7, "Oracle");
		
		String element =building.get(2);
		System.out.println("----------------------------------------------------");

		System.out.println(building.size());
		System.out.println(building);

		// how to get all keys
		Set<Integer> keys = building.keySet();// Set colllections store all my keys.to retrieve keys use-->
												// building.keySet();
		System.out.println(building.keySet());// print set

		System.out.println("--------Getting keys using iterator------------");

		Iterator<Integer> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			int key = keysIt.next();

			// key  1 is - and its value is
			System.out.println("Key is " + key + " its value is " + building.get(key));// to retrieve values use-->
																						// building.get(key);
		}

		System.out.println("--------------getting keys using for each loop----------------");
		for (int k : keys) {// Set collections stores my keys go and get from Set collection
			System.out.println("Key from building map " + k + ":" + building.get(k));
	}
	 
	     //how to get all values
	    Collection<String> values = building.values();//Iterable = Collection.  (building-->is our map)
	    System.out.println("-----------getting all values using for each loop---------------");
	    for(String v:values) {
	    	System.out.println("Value from collection "+ v);
	    }
	    System.out.println("------------getting all values using iterator-------------------");
	    Iterator<String> valuesIt = values.iterator();//since we have Collection line 47 then we can have here Iterator
	    while(valuesIt.hasNext()) {
	    	System.out.println("Map values: "+valuesIt.next());
	    }
	    
	    
	    
	    
	    
}
}
