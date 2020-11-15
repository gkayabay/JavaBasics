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
		ArrayList<String> sweets = new ArrayList<>(); //sweets is list type of collection
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco); //added entire choco collection to sweets collections(i collections birlikte ekledi)
		
        System.out.println(sweets.size());
        System.out.println(sweets);
        
        //we want to iterate through the collection
        Iterator<String> it = sweets.iterator(); //every collection has access to the iterator. sweets collection has an iterator and Iterator type 
        //iterates in 1 direction
        while(it.hasNext()) {
        	String element = it.next();
        	if(element.equals("ice cream")) {
        		it.remove(); //Anytime we remove from the collection use iterator
        	}
        }
        
        //iterates in 1 direction
        while(it.hasNext()) {//is the Iterator has next element yes then go grap it
        	String element = it.next();//grap next element and store it as String 
        	System.out.println(element);
        }
        
        //I want to get elements backwards
        for(int i = sweets.size()-1; i>=0; i--) {
        	System.out.println(sweets.get(i)+" ;");
        }
        //advanced for loop (Only from beginning until the ends so it is one way iterate direction)
        //iterates/loops in 1 direction
        for(String str: sweets) {
        	System.out.println(str);
        }
	}

}
