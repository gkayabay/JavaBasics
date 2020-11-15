package com.review10;
import java.util.*;
import java.util.Map.Entry;
public class MapIntro {
	//Map(HashMap, TreeMap, LinkedHashMap)
	
	public static void main(String[] args) {
		Map<Integer,String> phoneBook = new HashMap<>();
		phoneBook.put(12345578, "John Smith");
		phoneBook.put(67545578, "James London");
		phoneBook.put(14564978, "Rohani Smith");
		phoneBook.put(98755578, "Donald Trump");
		phoneBook.put(11111111, "Obama");
		phoneBook.put(12145578, "Brad Pitt");
		phoneBook.put(44444444, "John Smith");
		
		//it will override Rohani Smith
		phoneBook.put(14564978, "Julia Roberts");
		
		String name = phoneBook.get(12145578);
		System.out.println(name+ " is calling!");
		
		String name2 = phoneBook.get(5555);
		System.out.println(name2+ " is calling");//5555 no isnot in the Map so it will return null
		
		boolean contains = phoneBook.containsKey(5555);//if number 5555 contains inside phoneBook or not
		System.out.println(5555+ " is in the map: "+ contains);
		
		boolean contains2 = phoneBook.containsKey("Julia Roberts");
		System.out.println("Julia Roberts is in my contact list: "+contains2);
		
		//Will remove Trump from my list
		phoneBook.remove(98755578);
		
		System.out.println(phoneBook);
		
		phoneBook.isEmpty();
		
		/////////////////////////////////////////////////////////////////
		//All the Keys in the Set
		System.out.println("-----------------keySet-------------------");
		Set<Integer>keys= phoneBook.keySet(); //keys are unige thats why i can get the keys with set
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = phoneBook.get(key); //to get the value from the map
			System.out.println(key+" -> "+value);
		}
		
		System.out.println("----------------values-----------------------");
		//Get All the values and store them in a Collection
		Collection<String> values = phoneBook.values();
		
		for(String value : values) {
			System.out.println(value);
		}
		System.out.println("-----------------EntrySet----------------------");
		//Lets get the all the entries and store them in a Set
		 Set<Entry<Integer, String>> entries = phoneBook.entrySet();
		 
		 //1st way using Enhanced For Loop
		 for(Entry<Integer,String> entry:entries) {//i get the entry one by one
///			System.out.println(entry); (If i want to get key and value together)
			Integer key =  entry.getKey();//if I have the entry I can get the key
			String value=  entry.getValue();//if i have the entry I can get the value
			System.out.println(key+"--->"+value);
			
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		 }
		 
		 System.out.println("-----------------Iterator----------------------");
		 //2nd way, Using Iterator
		 Iterator<Entry<Integer, String>> entryIt = entries.iterator(); //iterating entry
		 while(entryIt.hasNext()) {
			 Entry<Integer, String> entry = entryIt.next(); //each entry has Entry and type
			 System.out.println(entry.getKey()+" : "+entry.getValue());
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
