package com.review09;

import java.util.*;

public class CollectionIntro {

	public static void main(String[] args) {
		LinkedList<String> africa =new LinkedList<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Algeria");
		africa.add(2,"Egypt");
		
		System.out.println("-----------Add All---------------");
		//1st way
		List<String> africa2 = new ArrayList<String>(africa);//I created a filled list
		System.out.println(africa2);
		
		//2nd way
		List<String> africa3 = new ArrayList<String>();//I created an empty list
		africa3.addAll(africa);
		System.out.println(africa3);
		
		System.out.println(africa);
		
		
		ArrayList<String> europe =new ArrayList<>();//ArrayList is created  but empty

		ArrayList<String> asia = null; //we dont have an object yet
		
		asia = new ArrayList<>();// I created a list but it is empty
		
		boolean empty = asia.isEmpty();
		System.out.println("Asia is empty "+ empty);
		
		asia.add("China");
		asia.add("Tajikistan");
		asia.add("Japan");
		asia.add("Turkey");
		asia.add("China");
		asia.add("Nepal");
		asia.add("Japan");
		
		System.out.println("Europe size is "+europe.size());
		System.out.println("Europe is empty "+europe.isEmpty());
		
		europe.add("Albania");
		europe.add("France");
		europe.add("Spain");
		europe.add("Portequal");
		europe.add("Turkey");
		
		europe.add(2,"Germany");
		
		System.out.println("Europe size is "+europe.size());
		System.out.println(europe);
		
		//europe.remove(4); // removing by index
		europe.remove("Turkey"); //removing by object name "Turkey"
		
		System.out.println("Europe size is "+europe.size());
		System.out.println("Europe is empty "+europe.isEmpty());
		
		
	
		System.out.println("--------iterate/loop------------");
	    //1st way 
		for(int i=0; i<europe.size(); i++) {
		String country = europe.get(i); //i am getting by index
		System.out.println(country+ " ");
		}
		System.out.println("-------using advanced loop---------");
	    //2nd way
		for(String country: europe) {
			System.out.println(country+ " ");
		}
		
		System.out.println("--------using iterator---------------");
		//3rd way by using iterator
		Iterator<String> it = europe.iterator();
//		it.next();//will return the next element from the collection
//		it.hasNext();//will return true/false
//		it.remove();//will remove the element while iterating
	
		String country1 = it.next();
		String country2 = it.next();
		String country3 = it.next();
		String country4 = it.next();
		String country5 = it.next();
		
		if(it.hasNext()) { //this is a safe check
			String country6 = it.next();
		}
		System.out.println(country1+" "+country2+" "+country3);
		
		Iterator<String> it2 = europe.iterator();
		while (it.hasNext()) {//as long as there is a next element. This will NOT move the cursor
			  String country = it.next();//Get the next element. This will move the cursor
		   		System.out.println(country+" ");
		}
		System.out.println();
	
	}
	//HW Add countries into Asia , add duplicates
	//iterate the Asia list and remove duplicates
	//hint: you can create a new List
	//copy from Asia into new List, but first check if the list CONTAINS the country

}
