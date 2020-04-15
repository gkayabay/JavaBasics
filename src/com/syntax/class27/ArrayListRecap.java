package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//create arraylist that stores Double type of objects
		//1.generic arraylist/arraylist(collection tipinde)
		ArrayList<Double>alist = new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		//alist.add("Hello"); HAST TO BE SAME TYPE AS DOUBLE 
		System.out.println(alist);
		
		//replace element
		alist.set(1, 13.90);//take the first index and replace with 13.90
		System.out.println(alist);
		
        //remove element
		alist.remove(13.90);
		System.out.println(alist);
		
		//retrieve single element
		System.out.println(alist.get(1));
		
		
		//retrieve all elements from collection
				for(double a:alist) {
					System.out.println(a);
				}
		
		//2. for loop 	
		for(int i=0; i<alist.size(); i++) {
			double d = alist.get(i);
				System.out.println(d);
			}
		
		
		//3. Iterator
		Iterator<Double> iterator = alist.iterator();//it will give an 1 object as Iterator type
		while (iterator.hasNext()) {//is your iterator has next element and go loop
			double d = iterator.next();// it grabs the next element //we can use also Double or double
			System.out.println(d);
		}
				
				
		System.out.println("----------Non Generic Collection--------------------");
		
		//2.non generic collection/arraylist (Does not have collection type )
		ArrayList obj = new ArrayList();//bu obj de farkli type lar var.
		obj.add("Hello");//store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(alist);//store collection object
		System.out.println(obj);
		
		//retrieve all elements from collection
		for(Object o :obj) { //Object type because obj has all different types like it hasString, Double, Char etc.
			System.out.println(o);
		}
	}
		
	}


