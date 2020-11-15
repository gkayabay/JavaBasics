package com.gulbahar.practices;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		
//		String name = "Tugba";
//		String lastName= "Akca";
//		String grade = "100";
//		String city = "Boston";
//		String state= "MA";
//		String phoneNumber = "6466411006l";
//		
//		city= "Allston";
//		state= "NY";
//		phoneNumber= "3474558976l";
//		grade = "90";
		
		Map<String, String> map = new TreeMap<>();	
		map.put("name", "Tugba");
		map.put("lastName", "Akca");
		map.put("grade", "100");
		map.put("city", "Boston");
		map.put("state", "MA");
		map.put("phoneNumber", "6466411006l");
		
		System.out.println(map.size());
	
		 Iterator<String> it = map.keySet().iterator();
		 while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "--->"+map.get(key));
		 }
		 for(String i:map.keySet()) {
			 System.out.println(i +" "+map.get(i));
			 
		 }
		
	}

}
