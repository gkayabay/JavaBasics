package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
	//HW1 Create 3 objects of the sub classes and store them in ArrayList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class. 

		Insurance car = new Car("Amica", "Toyota");
		Insurance pet = new Pet("Figo","Dog");
		Insurance health = new Health("BlueCross");
		
		
		ArrayList<Insurance> alist = new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		System.out.println("---------------------------------------");
		//2nd way using HashSet ile
		HashSet<Insurance>hset =new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<Insurance> it= hset.iterator();
		while(it.hasNext()) {
			//Insurance obj = new Car("Geico", "BMW")
			//we need to assing it to the variable becaause if we use it.next()-->moves to the next element
		     Insurance obj = it.next(); //every element is stored in the obj and then grab the next element
		     obj.getQuote();
		     obj.cancelInsurance();
		     
		    // obj.method();//calling the Coverage (Parent)class method
			
		}
		System.out.println("-------------------------------------------");
	
		System.out.println("---------------Advanced Loop--------------");
		
		for(Insurance c :alist) {
			c.getQuote();
			c.cancelInsurance();
			
		}
		System.out.println("-------------For Loop----------------------");
		
		for(int i=0; i<alist.size(); i++) {
			alist.get(i).getQuote();
			alist.get(i).cancelInsurance();
		}
		
		System.out.println("-------------Iterator-----------------------");
		
		Iterator<Insurance> iterator = alist.iterator();
		 while(iterator.hasNext()) {
		 Insurance el = iterator.next();		
		 el.getQuote();
		 el.cancelInsurance();
		 System.out.println(" ");
		
		
	}
	}
}

