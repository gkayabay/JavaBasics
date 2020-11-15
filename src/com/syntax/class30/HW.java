package com.syntax.class30;

import java.util.*;


public class HW {

	public static void main(String[] args) {
//Create the collection that will store single uniques Objects 
//of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection
		
	Set<String> words = new LinkedHashSet<>();
	words.add("Java");
	words.add("Selenium");
	words.add("Cucumber");
	words.add("Pyhton");
	
	
     for(String str : words) {
    	 System.out.println(str+" ");
	
	}
}

}