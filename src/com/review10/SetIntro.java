package com.review10;

import java.util.*;

public class SetIntro {

	public static void main(String[] args) {
//                                   Collection 
//List implements( ArrayList, LinkedList )  |  Set(implements HashSet, LinkedHashSet, TreeSet)  |  Queue
		
		Set<String> africaLinked = new HashSet<>();
		africaLinked.add("Tunusia");
		africaLinked.add("Morocco");
		africaLinked.add("Kenya");
	
		//will not add in the Set because it already exist
		africaLinked.add("Kenya");
		
		africaLinked.add("Algeria");
		//You cannot add with an index!!
//		africa.add(2,"Egypt");  (set do no have indexes) 
		
		System.out.println("LinkedHashSet" +africaLinked);
		
		Set<String> africa2 = new HashSet<>(africaLinked);
		System.out.println("HashSet "+africa2);
		
		Set<String> africa3 = new TreeSet<>(africaLinked);
		System.out.println("TreeSet "+ africa3);
		
		int size = africa2.size();
		boolean contains = africa2.contains("Kenya");
		boolean isEmpty= africa2.isEmpty();
		boolean ableToRemove= africa2.remove("Algeria");
		
		//You are not able to remove bby index in Set
		//africa2.get(2);
		
		//1st way regular for loop
		//there is no index in Set so you can nnot use regular forloop
		
		System.out.println("------------enhanced for loop------------");
		//2nd way enhanced for loop
		for(String country: africa2) {
			System.out.println(country+ " ");
		}
		System.out.println();
		
		System.out.println("  by using Iterator ");
		//3rd way using Iterator
		Iterator<String> it= africa2.iterator();
		  while(it.hasNext()) { //first we check then 
		    String country = it.next();//as loong as there is a next get the next element 
		System.out.println(country+" ");
		  }
		
		//Note: List preserves insertion order, BUT Set does NOT
		// List contains duplicates BUT Set contains Unique objects
		 
		  Set<String> europe = new HashSet<>();
		  europe.add("Albania");
		  europe.add("France");
		  europe.add(null);
		  europe.add("Spain");
		  europe.add("Portuqal");
		  europe.add( null);
		   
		  System.out.println(europe);
		  
		  //Collection Framework
		  //Collection Interface
		  //Collections is class (has ready method)
		  
		  String minimum = Collections.min(africa2); //ordered by alphabetically
		  System.out.println(minimum);
		  
		  Set<Integer> numbers = new HashSet<>();//non generic set we can put anything like string, int etc
		  numbers.add(56);
		  numbers.add(23);
		  numbers.add(49);
		  numbers.add(93);
		  numbers.add(17);
		  
		  
		  for(Integer obj : numbers) {
			  System.out.println(obj);
		  }
		  
		  Integer minInt = Collections.min(numbers); //to get min numbers from the collection
		  Integer maxInt = Collections.max(numbers);  // to get max number 
		  System.out.println("Numbers from "+minInt+ " to "+maxInt);
		  
	}
	

}
