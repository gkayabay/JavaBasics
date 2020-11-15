package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {

	String type, name;
	
	public Store(String type, String name) {
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("This is store "+ name);
	}
	public abstract void workingHours();
}

class Nike extends Store {

	public Nike(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name+ " works from 10 am until 6 pm");
	}
}
class Costco extends Store {

	public Costco(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
			System.out.println(name+ " works from 8 am until 8 pm");
		}
		
	}
	
class Amazon extends Store {

	public Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+ " works 24/7");
		
	}
}
 
public class UserDefinedClassesInMap {
	
 public static void main(String[] args) {
	 //we want to store in form 1 ---> AMAzon, 2---> Costco 3--->Nike
	 Map<Integer, Store> storeMap = new LinkedHashMap<>();
	 storeMap.put(1, new Amazon("online", "Amazon"));//inside the map we store obj of userdefined 
	 storeMap.put(2, new Costco("wholesale", "Costco"));
	 storeMap.put(3, new Nike("retail", "Nike"));
	 
	 System.out.println(storeMap);
	 
	 //to get an access to all methods of our Store Objects: values(),  entrySet(), keySet(),
	 
	 //to get all Value Objects
	  Collection<Store> col= storeMap.values(); //bring Collection
	  for(Store store : col) {
		  store.workingHours(); //these methods are belong to the Store 
		  store.display();
		  System.out.println("-----------------------------------------");
	  }
	  
	  System.out.println("-----------------USING ENTRY SET-----------------");
	  //2.way --->get all Entry Objects --->getValue
	 Set<Entry<Integer, Store>> storeSet = storeMap.entrySet();
	 for(Entry <Integer,Store> entry : storeSet) {
		 entry.getValue().workingHours();
		 entry.getValue().display();
		 System.out.println("------------------------------------------");
	 }
	 
	 //3rd way --->get all keys---> get value of specified key
	  Set<Integer> keys = storeMap.keySet();//from your map use keySet get through the iterator 
	  for(Integer key: keys) {
		  Store obj= storeMap.get(key); //get the key 
		   obj.display();//call the methods 
		   obj.workingHours();//call the methods
	  }
	  
	  //4th way using iterator
	  System.out.println("----------------USING ITERATOR-----------------------");
	   Iterator<Entry<Integer, Store>> entryIterator= storeSet.iterator();
	   while(entryIterator.hasNext()) {
		    Entry<Integer, Store> e = entryIterator.next();
		   e.getKey();
		   e.getValue().workingHours();
		   e.getValue().display();
		   System.out.println("-------------------------------------------------");
		
		  
		   
		    
	   }
}
	
	
}