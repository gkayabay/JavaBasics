package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		//TASK 1- Create an array of animals and store 6 elements into it.  
		//Using 2 different loops print all elements from the array
		
		String[] animals= {"Monkey", "Zebra", "Panda", "Leopar", "Lion","Whale"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		//2nd way
		for(String animal:animals) {
			System.out.println(animal+" ");
		}
		
		//TASK 2- create an array on integers and calculate the sum of all integer elements in an array
		
		int[] numbers = {4,6,8,10,20};
		int sum=0;
		
		for(int i:numbers) {
			sum+=1;
		}

	    System.out.println("The sum of the numbers in this array is : "+sum);
	    
	    //2nd way
	    System.out.println("-------------Using another loop----------------------");
	    int sum1=0;
	    for(int i=0; i<numbers.length; i++) {
	    	sum1+=numbers[i];
	    System.out.println("The sum of the numbers in this array is : "+sum1);
	    }
		

	    
	    //TASK 3- Create an array of countries. 
	    //While retrieving all values from an array print capital for each country(use 2 different loops)
		
	    String[] countries= {"USA", "Turkey","Germany","France","Brazil"};
	    for (String country:countries) {
	    
	    	if(country.equals("USA")) {
	    		System.out.println("The capital of "+country+ " is Washington DC");
	    	}else if(country.equals("Turkey")) {
	    		System.out.println("The capital of "+country+ " Ankara");
	    	}else if(country.equals("Germany")) {
	    		System.out.println("The capital of "+country+ " Berlin");
	    	}else if(country.equals("France")) {
	    		System.out.println("The capital of "+country+ " Paris");
	    	}else if(country.equals("Brazil")) {
	    		System.out.println("The capital of "+country+ " Sao Paulo");
	    		
	    		
	    System.out.println("-------------------2nd way---------------");
	    for(int y=0; y<countries.length; y++) {
	    	
	    	switch(countries[y]) {
	    	
	    	case "USA":
	    		System.out.println("The capital is Washington DC");
	    		break;
	    	case "Turkey":
	    		System.out.println("The capital is Ankara");
	    		break;
	    	case "Germany":
	    		System.out.println("The capital is Berlin");
	    		break;
	    	case "France":
	    		System.out.println("The capital is Paris");
	    		break;
	    	case "Brazil":
	    		System.out.println("The capital is Sao Paulo");
	    		break;
	    }
	    }	
	    	}
	    	
	    }
	}
}
	


