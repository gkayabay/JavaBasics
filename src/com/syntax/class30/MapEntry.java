package com.syntax.class30;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		//create a map that will store months and days in month
		
		Map<String, Integer> month = new LinkedHashMap<>();
		month.put("January", 31);//entry
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());//gives number of entries
		
		//get all entries from a map
		Set<Entry<String, Integer>> entries = month.entrySet();//we get entry from our map and we store this inside of our unique collection Set and Entry type  
	    //inside Set collection I have Entry object and stored here
		System.out.println(entries);
		
		
		//loop through all entry objects 
		for (Entry<String, Integer> e : entries) { //entries collection Entry type olarak stored inside e variable
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println("---------------------Using Iterator--------------------------");
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it = entries.iterator();//when you have entries collection call the iterator method
		while(it.hasNext()) {                                    //inside Iterator we have Entry objects. inside Entry objects have key+values 
			//System.out.println(it.next().getKey()+" value= "+it.next().getValue());
			Entry<String,Integer> entry = it.next();//Always specify the Entry types is it is String, Integer gibi
			System.out.println(entry);
			System.out.println("Key "+ entry.getKey()+" == "+entry.getValue());
		}
		
	
	}

}
