package com.syntax.class29;

import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {
 
	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Facebook");
		map.put(4, "Twitter");
		map.put(5, "Amazon");
		map.put(6, "Google");
		map.put(7, "Syntax");
		System.out.println(map.size()); //size of the map
		System.out.println(map.toString()); //prints to a string (map.toString)
	
		//to retrieve all the keys from the map map.keySet();
		Set<Integer> keys =map.keySet();
		
		for(Integer k: keys) {
			System.out.println(k +" "+map.get(k)); 	//value-->map.get(k)               
		}
		System.out.println("------------------All the Entry-----------------------");
		System.out.println(map.entrySet());
		
		System.out.println("------------------All Values--------------------------");
		//to retrieve all values from map
		Collection<String> values = map.values();	
		System.out.println(values);
	
		System.out.println("-------------Update 4th Floor Value------------------ -");
		//update company on the 4th floor
		map.put(4,"Thomson");
        System.out.println(map);
	    
        System.out.println("--------------Remove Company on the 7th Floor----------");
	    map.remove(7);
	    System.out.println(map);
	}
	}