package com.syntax.class31;

import java.util.*;
import java.util.Map.Entry;

public class MapRecap {

	public static void main(String[] args) {

		// create a a hashmap of countries with capitals
		Map<String, String> hmap = new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		// for hashMap nnull value is ok can have
		hmap.put("Italy", null); // default value of any object is null value
		hmap.put(null, "some value");
		hmap.put(null, "another value");// duplicate key, previous values will be overwritten
		hmap.put("Germany", null);
		System.out.println(hmap);

		// how to get all keys from a map keySet(), entrySet();
		Set<String> keys = hmap.keySet(); // use loop or iterator to iterate over keys
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------Keys Using entrySet-------------------");
		Set<Entry<String, String>> entries = hmap.entrySet(); // refer to map first
		Iterator<Entry<String, String>> iter = entries.iterator(); // here we have Iterator of Entry objects

		// lets get both key and value
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			String myEntry = entry.getKey() + "--" + entry.getValue();
			System.out.println(myEntry);
		}

		System.out.println("----------get Values using values(); and entrySet--------");
		// how to get values from a map : values(); entrySet();
		Collection<String> values = hmap.values();// call hashmap.values() method --we get Collection
		it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// create HashTable of counries with capitals
		Map<String, String> htable = new Hashtable<>(); // you cannot have multiple values
		htable.put("Tajikistan", "Dushanbe");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		// we cannot store null values inside hashtable
		// htable.put("Italy", null); //during runtime it gives an NullPointer exception
		// error
		// htable.put(null,"some value");//we cannot store null keys inside key gives an
		// exception error during runtime
		System.out.println(htable);

		// first part of the code
		createMap("City", "Chantilly");

		// second part of the code
		createMap("City", "Washington DC");

	}

	public static Map<String, String> createMap(String key, String value) {
		Map map = new HashMap<>();
		map.put(key, value);
		return map;

	}

}
