package com.syntax.class29;
import java.util.*;
public class Questions {

	public static void main(String[] args) {
//How to remove duplicate from ArrayList
		
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set = new LinkedHashSet<>(aList);//aList eklendi set collections a
		set.addAll(aList); //2.way aList is added into set collection by addAll
		System.out.println(set);
		set.add("Alijon");
		set.add("Usman");
		
		//how to get only 1 value from set?
		if(set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		//1 convert to list
		List<String> list = new ArrayList<>(set);//to retirieve specific value we use ArrayList
	    String name = list.get(4);
	    System.out.println(name);
	    list.add("Jane");
	    list.add("Jane");
	    list.add("Jane");
	    System.out.println(list);
	    
	    
	    //2 convert to array  (to get the specific element)
	     Object[] array = set.toArray();//convert to array of Object
	     System.out.println(array[5]);
	     //array is a utility class that has methods to work with arrays
	     Arrays.sort(array); //Array is utily class and collections also utility class it will have methods
	     
	     
	     //to sort elements of any collection in aplhabetical order
	     //collections is a utility class that has methods to work with collections
	     Collections.sort(list); //to sort collections 
	     System.out.println(list);
	     
	}

}
