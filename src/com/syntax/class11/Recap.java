package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		String[][] groceries= {
				{"cucumber","Potato", "carror"},
				{"mango", "apple","banana","kiwi"},
				{"milk", "cheese","yoghurt"},
			    };
		
		System.out.println(groceries[1][2]);
		
		//get all values from 2D Array
		for(int r=0; r<groceries.length; r++) {
			for(int c=0; c<groceries[0].length; c++) {
				
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("-----Getting Elemenst Using Advanced For Loop");
		//loops thorugh all array
		for(String[]array:groceries) { //en distaki loops taki 3 rows u loop yapar
			//loops through each single array
			for(String items: array) {
				System.out.println(items+" "); //used nested loop and prints every elements 
			}
			System.out.println();
		}
	
	}

}
