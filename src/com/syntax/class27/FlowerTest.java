package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
	
		//store flowers into array
		Flower [] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
		
		//flower into arraylist
          ArrayList<Flower> flowers= new ArrayList<>();//collection of Flower type in da
		  flowers.add(new Rose("Rose"));
		  flowers.add(new Tulip("Tulip"));
		  flowers.add(new Sunflower("Sunflower"));
		 // flowers.add("Rose");cannot add String Object into ArrayList of flower Objects
		
		  
		  //Call Avaliable methods using for loop, Advanced for loo, and Iterator
		  System.out.println("------------Advanced for Loop------------------");
		  for(Flower f:flowers) {
			  f.bloom(); //call the bloom method for each object
		  }
		  System.out.println("------------for Loop---------------------------");
	      for(int i=0; i<flowers.size(); i++) {
	    	  flowers.get(i).bloom();
	      }
	      
	      System.out.println("------------Iterator Method--------------------");
	       Iterator<Flower> it= flowers.iterator();
	       while(it.hasNext()) {
	    	  Flower flo = it.next();
	    	  flo.bloom();
	       }
	}

}
