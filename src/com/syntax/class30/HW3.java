package com.syntax.class30;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW3 {

	public static void main(String[] args) {
		//Create a Map that will store Employee name and salary. 
		//Write a logic to retrieve an employee who gets the highest salary. 
		//Output should be in the below format
		//John Smith=$100000
		
		Map<String, Integer> empMap = new TreeMap<>();
		empMap.put("Melody Sun", 150000);
		empMap.put("Jane Sun", 130000);
		empMap.put("Henry Sun", 180000);
		
		Set<Entry<String, Integer>>empSet= empMap.entrySet();
		Iterator<Entry<String, Integer>>it= empSet.iterator();
		int max =0;
		while(it.hasNext()) {
			int salary = it.next().getValue();
			
			if(salary>max) {
				salary= max;
			}else {
		
			System.out.println(max);
		}
		}
	}
}

	
		
	
	


