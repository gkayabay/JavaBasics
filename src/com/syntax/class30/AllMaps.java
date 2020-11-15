package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
	   //create a grocery map (item, quantity) in which we do not care about the order
		
		Map<String, Integer> grocery = new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		
		System.out.println(grocery);
		
		//create a map of items to buy(item, quantity) in which we want save the order
		Map<String, Integer> household = new LinkedHashMap<>();
		household.put("Lysol",2);
		household.put("sanitizer",2);
		household.put("paper towel",3);
		household.put("toilet paper",10);
		household.put("face mask",50);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping = new TreeMap<>(grocery);
		shopping.putAll(grocery); //grocery is added to shopping Map 
		System.out.println(shopping);
		
		//get all keys using loop
		for(String key : shopping.keySet()) {  //Set<String> keys = shopping.keySet();
			System.out.println("Key: "+ key);
			
		}  
		//get all keys using iterator
		Iterator<String> it = shopping.keySet().iterator();//map.keySet();
        while(it.hasNext()) {
        	System.out.println("Keys "+ it.next());
        }
        
        //get all values 
        for(int val :shopping.values()) {//call the map --> shopping.values() where my values there
        System.out.println("Values: "+ val);
        
        //get all values using iterator
        Iterator<Integer> iterator = shopping.values().iterator(); //call the-->shopping.values()
        while(iterator.hasNext()) {
        	System.out.println("Value = "+iterator.next());
        }   
	}

	}
}
