package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map<String,String> land=new TreeMap<>();
		
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		
		System.out.println(land);
		
				
		//storing all entry objects into a set
		Set<Entry<String, String>> allEntries = land.entrySet();//converted to Set collection or Collection (which is upcasting(recommended) from Set to Collection)
		System.out.println(allEntries);
		
		System.out.println("-------loop through all entries to get a key and values-----------");
        for(Entry<String,String> entr : allEntries) { //inside Entry objects there are key+Value
        	String key = entr.getKey(); //print keys
        	String value=entr.getValue();//print values
        	System.out.println(key+"--"+value);//key.toUpperCase()+" "+value.toLowerCase(); kullanilabilir
        }
        
        System.out.println("-------------iterate through all entries to get a key and value---------");
       Iterator<Entry<String, String>> entryIterator = allEntries.iterator();//call iterator methodu
       while(entryIterator.hasNext()) {
    	   Entry<String, String> e = entryIterator.next();
    	  String key$value = e.getKey()+":::"+e.getValue();
    	   System.out.println(key$value);
       }

	}

}
