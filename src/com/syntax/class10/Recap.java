package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String[] cities= {"Washington DC", "New York", "Paris", "Miami", "Los Angeles", 
				           "Dallas","Chantilly"};
		//I live in Paris
		System.out.println("I live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to"+cities[x]);
		
		//How many elements are stored inside an array
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
		//how can we access last element from an array
		System.out.println(cities[arraySize-1]);
		
		//access all elements from an array
		//cities[0], cities[1], cities[2]
		for(int i=0; i<arraySize; i++) {    //if i<=arraySize olursa it will give error "ArrayIndexOutofBoundsException
			System.out.println(cities[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
