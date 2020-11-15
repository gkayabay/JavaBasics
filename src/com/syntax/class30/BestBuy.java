package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy {

	public static void main(String[] args) {
		
		Map<Integer,String> BestBuy =new TreeMap<>();
		BestBuy.put(7662847, "Printer");
		BestBuy.put(7819885, "TV");
		BestBuy.put(7664653, "laptop");
		BestBuy.put(7669847, "Radio");
		BestBuy.put(7664847, "DVD Player");
		
		System.out.println(BestBuy);
		
		//storing all entry objects into a set
	Set<Entry<Integer, String>> allEntries = BestBuy.entrySet();
	System.out.println(allEntries);
	

	System.out.println("-------loop through all entries to get a key and values-----------");
	for(Entry<Integer, String> entr: allEntries) {
		Integer key = entr.getKey();
		String value = entr.getValue();
		System.out.println(key+ " :"+value);
	}
	
	System.out.println("--------------------------Using Iterator------------------------- ");
	Iterator<Entry<Integer, String>> entryIterator = allEntries.iterator();
	while(entryIterator.hasNext()) {
	Entry<Integer, String> e = entryIterator.next();
	System.out.println(e.getKey()+" "+e.getValue());
	}
	

	}

}
