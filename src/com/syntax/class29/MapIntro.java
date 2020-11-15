package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		
		//HashMap is not maintain the order
		Map<String, String> hmap = new HashMap<>();//i create the object of HashMap and type is HashMap
		
        //to store values into Map we use put 
		hmap.put("Name", "John");
		hmap.put("LastName", "Smith");
		hmap.put("Adress", "123 Test");
		hmap.put("City", "Chantilly");
		
		//how to check if map has any values?
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Map is empty ="+isEmpty);
		
		//how many elements has Map
		int size = hmap.size();
		System.out.println("Map size is ="+size); //size is 4 because each entry(Key+value) counts 1
		
		//can we add more values into map?
		hmap.put("Zip", "12345");
		
		//can we store duplicate keys? NO previous value will be replaced
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		//how can we access the value?--->use method get and specify the key
		System.out.println(hmap.get("Name"));
		
		//to remove the value
		hmap.remove("Adress");
		System.out.println(hmap);
		
		//replce values in map
		hmap.replace("Zip", "98765");
		System.out.println(hmap);
		 
	
	}

}
