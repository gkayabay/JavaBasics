package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		//In Test Class create a Map that will store key in ascending order. 
		//In that map store personId and a Person Object. Print each object details.
		
		Map<Integer,Person> perMap = new TreeMap<>();
		perMap.put(1235, new Person("Jayden", "Smith", 28, 70000));
		perMap.put(6781, new Person("Will", "Hanson", 32, 85000));
		perMap.put(2765, new Person("Riley","Harry", 25, 65000));

		//System.out.println(perMap);
		
		
		System.out.println("----------------Advanced for Loop------------------------");
		 //to get an access to all methods of our Person Objects: values(),  entrySet(), keySet(),
		 
		 //to get all Value Objects
		Collection<Person> col= perMap.values();
		for(Person per :col) {
			per.display();
		}
		
		 System.out.println("-----------------USING ENTRY SET-----------------");
		  //2.way --->get all Entry Objects --->getValue
	
		    Set<Entry<Integer,Person> > perSet= perMap.entrySet();
		    for(Entry<Integer, Person> entry : perSet) {
		    //	System.out.println(perMap.get()+ " "+entry.getValue().display();
		    }
		    
		  //3rd way --->get all keys---> get value of specified key
		  Set<Integer> keys = perMap.keySet(); //
		  for(Integer key : keys) {
			    Person obj = perMap.get(key);
			    obj.display();
		  }
		  
		  //4th way using iterator
		  System.out.println("----------------USING ITERATOR-----------------------");
		     
		  Iterator<Entry<Integer,Person>> it = perSet.iterator();
		  while(it.hasNext()) {
			Entry<Integer,Person> e = it.next();
			e.getKey();
			e.getValue().display();
		  }
	}

}
