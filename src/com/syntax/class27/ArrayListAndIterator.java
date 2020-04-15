package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
		
		//create an ArrayList of Chocolate
		
		ArrayList<String> choco = new ArrayList<>();
		 
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
		//create arraylist of  sweets
		ArrayList<String> sweets = new ArrayList<>(); //
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco); //added entire choco collection to sweets collections(i collections birlikte ekledi)
		
        System.out.println(sweets.size());
        System.out.println(sweets);
        
        //we want to iterate through the collection
        Iterator<String> it = sweets.iterator(); //every collection has access to the iterator
        
        while(it.hasNext()) {//is the Iterator has next element yes then go grap it
        	String element = it.next();//grap next element and store it as String 
        	System.out.println(element);
        }

	}

}
