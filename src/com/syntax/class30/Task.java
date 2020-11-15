package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		//Task Create a map of countries with its capital that will store countries in alphabetical order.
		//Print all keys and values from a country map using for each loop and iterator.
		//Print all values from a country map using for each loop and iterator.
		
	Map<String, String> country = new TreeMap<>();
	country.put("Turkey", "Ankara");
	country.put("USA", "Washington DC");
	country.put("Kazakhistan", "Almata");
	country.put("Brazil", "SaoPaulo");
	country.put("England", "London");
	System.out.println(country);
	
	System.out.println("-----------------getting keys with for each loop---------------------");
	for(String key : country.keySet()) {
		System.out.println("Key : "+ key);
		
	}
	System.out.println("----------------getting keys with iterator-----------------------------");
	
	Iterator<String> it = country.keySet().iterator();
	while(it.hasNext()) {
		System.out.println("Key :" +it.next());
	}
	
	System.out.println("-----------------getting values for each loop-------------------------");
	for(String val: country.values()) {
		System.out.println(val);
	}
	
	Set<Entry<String, String>> entry = country.entrySet();
	System.out.println(entry);
	
	System.out.println("---------------------Usiing Iterator to get Key and Values----------------------------------");
       Iterator<Entry<String, String>> iterator= entry.iterator();
       while(iterator.hasNext()) {
    	    Entry<String, String> e = iterator.next();
    	    System.out.println(e.getKey()+" : "+e.getValue());
       }
	}

}
