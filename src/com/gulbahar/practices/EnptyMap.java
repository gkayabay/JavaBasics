package com.gulbahar.practices;

import java.util.*;
import java.util.Map.Entry;
public class EnptyMap {
	 public static void dispay(Map<String, Integer> map)  {
	       if (map.isEmpty()){ 
	            System.out.println("map is empty"); 
	        }else{ 
	            for (String keys : map.keySet()) {
	              System.out.println (keys + " : " + map.get(keys));
	            }                   //key            //value
	        } 
	     }
	  public static void main(String[] args) {
	   Map<String, Integer> map = new HashMap<>(); 
	          
	        map.put("mango", 10); 
	        map.put("apple", 30); 
	        map.put("orange", 20); 
	     dispay(map); 
	     map.clear();
	     dispay(map); 
	  }
	}
	 

