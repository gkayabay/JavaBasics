package com.review10;

import java.util.*;
import java.util.Map.Entry;
public class WorldMap {
	public static void main(String[] args) {
		Map<String, String> europe = new HashMap<>();
		europe.put("France", "Paris");
		europe.put("Italy", "Rome");
		europe.put("Germany", "Berlin");
		
		System.out.println(europe); // { }---> PRINTING AS MAP
		
		Set<Entry<String, String>> entries = europe.entrySet();//set of entires
		System.out.println(entries); //[ ]-->collection  
		

		System.out.println("--------Iterate europe by getting keys---------------");
	    Set<String> keys =  europe.keySet();
	    for(String key:keys) {
	    	System.out.println(key);
	    }
		
		Map<String, String> africa = new HashMap<>();
		africa.put("Morocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("Tunusia", "Tunis");
		System.out.println(africa);
		
		System.out.println("--------iterate africa by getting entries-----------");
		Set<Entry<String, String>> es = africa.entrySet();
		for(Entry<String, String> e :es) {
			String key = e.getKey();
			String value =e.getValue(); //line 32 ve 33 skip yapip sadece Syso(e); entryset i verir.
		System.out.println(key+"-->"+value);	
		}
		
		
		Map<String, String> asia = new HashMap<>();
		asia.put("China", "Beijing");
		asia.put("Turkmenistan", "Ashgabat");
    	asia.put("Japan", "Tokyo");	
    	System.out.println(asia);
    	
    	
    	System.out.println("-------------iterate asia by getting values-------------");
    	 Collection<String> values  = asia.values();
    	 for(String value:values) {
    		 System.out.println(value);
    	 }

		
		System.out.println("----------------WORLD------------------------------");
		List<Map<String, String>> world = new ArrayList<>();//i have map inside List.
		world.add(europe);
		world.add(africa);
		world.add(asia);
		
//		System.out.println(world); //i have 3 maps inside world 
		
		//iterate the World bby Advanced for Loop
		for(Map<String, String> continentMap : world) {
//		 System.out.println(continentMap);
			Set<String>countryNames = continentMap.keySet();//for every continent (map) get the capital city
			for(String country : countryNames) {
				System.out.println(country+"-->"+continentMap.get(country));
			}
			System.out.println();	
		}
		System.out.println("------------Iterator-------------------------");
			//HW Optional - get iterate the World by using iterator
		Iterator<Map<String, String>> continent = world.iterator();
		while(continent.hasNext()) {
			Map<String, String> cont= continent.next();
			System.out.println("Continent: "+cont);
			
			
			
		}
		}
}
