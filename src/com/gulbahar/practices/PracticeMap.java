package com.gulbahar.practices;
 
		 import java.util.*;
		 import java.util.Map.Entry;
		 
		 class PracticeMap {
		   public static void main(String []args) {
		     Map<String, String> map = new HashMap<>();
		     map.put("ONE","AAA");
		     map.put("TWO","BBB");
		     map.put("THREE","CCC");
		     map.put("FOUR","DDD");
		     map.put("FIVE","EEE");
		     
		   Set<Entry<String,String>> ent= map.entrySet();
		   for(Entry<String, String> e: ent ) {
		     System.out.println(e.getKey()+":" +e.getValue());
		   }
		    
		   map.remove("ONE");
		   map.remove("FOUR");
		 System.out.println("------------------------");
		   //Set<Entry<String,String>> ent= map.entrySet();
		   for(Entry<String, String> e: ent ) {
		     System.out.println(e.getKey()+":" +e.getValue());
		    
		    	
		    }
		   }
		   }
		   
		   
		 
		   
		   
		

	