package com.gulbahar.practices;

import java.util.ArrayList;

public class ArrayListHW {
	//Task1(HW)
	//Create a generic ArrayList that will store 5 names into it. 
	//Find out whether the given ArrayList is empty or not? 
	//Check whether the specific name is present in an ArrayList or not?
	//Find the size of your arrayList and print all values from that
	
	//1st way 
	public static void main(String[] args) {

		//create an arrayList with names
		
    	ArrayList<String>arrayList = new ArrayList<>();
    	//add String names object into arrayList
    	arrayList.add("Merve");
    	arrayList.add("Julia");
    	arrayList.add("Kamden");
    	arrayList.add("Jayden");
    	arrayList.add("Gio");
    	
    	
    	System.out.println(arrayList.contains("Kamden"));//is arrayList contains Kamden? //true
    	System.out.println(arrayList.contains("Marvin"));//false , does not contain
    	System.out.println(arrayList.isEmpty());//is arrayList is empty?
    	System.out.println(arrayList.size()); //arrayList.size is 5
    	
    	//print all the values from the arrayList
    	for(String names:arrayList) {
    		System.out.println(names);
    	}
	System.out.println("---------------");
	}
	//2nd Way
	private static void printMe(String[] name) {
		
		 printMe(name);
	}

	String [] name = {"Maven","Emily","Riley","Willy","Skye"};
   
	public static <T> void printMe(T[] a) {
	
	for(T b:a) 
		System.out.printf("%s ", b);
	System.out.println();
	
	}
	
		
	}
