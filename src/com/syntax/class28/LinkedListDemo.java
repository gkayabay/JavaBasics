package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();// create an object in LinkedList Class
		llist.add("Yunus");// comes from collection. This add method will be avalaible for all colection
		llist.add(0, "Reyhan");// comes from List. Avaliable within the List
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");

		int size = llist.size();// gives the llist size

		// get all elements 1 by 1 in 3 different ways
		for(int i=0; i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		for(String a: llist) {
			System.out.println(a);
		}
		
		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//can we store the objects of user defines classes? //we can also go from LinkedList to List(like from child class to parent)
		List <Food> food = new LinkedList<>();//inside ListLink we store Food type object
		food.add(new Salad("salad","tomatoe and cucumber",100));//objects our own collections
		food.add(new Dessert("desert", "chocolate", 1000));
		food.add(new MainDish("Pasta","mushrooms",800));
		food.add(new MainDish("Pasta","mushrooms",800));//can have duplicate elements
		
		for(Food f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			
			System.out.println("--------------------------------------");
		}
		
	}	
}
