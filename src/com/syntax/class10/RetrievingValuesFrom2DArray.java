package com.syntax.class10;

public class RetrievingValuesFrom2DArray {

	public static void main(String[] args) {
		   //Arrays in months
	    String[][] month= {
	    	               {"January", "February", "December","Hi", "Hello"},
	    		           {"March", "April", "May", "june"},
	    		           {"July", "August", "September"},
	    		           {"October", "November", "December"}	                        
	                        };
	    
	   int rows = (month.length); //how many arrays
	   int firstArray= month[0].length;//go to first array and say how many elements in array 1
	                                   //Array 0 da there are 3 elements in it.
	    System.out.println(firstArray);
	    
	    for(int i=0; i<month.length; i++ ) { //iterates over rows
	    	
	    	for(int j=0; j<month[i].length; j++) { //iterates over columns
	    		
	    		System.out.print(month[i] [j] +" ");
	    	}
	    	System.out.println();
	    }
	   
	}

}
