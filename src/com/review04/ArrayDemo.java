package com.review04;

public class ArrayDemo { 

	public static void main(String[] args) {
		int a0=5;
		int a1=7;
		int a2=8;
		int a3=9;
		int a4=20;
		System.out.println(a1);
		System.out.println(a2);
		
		//1st Professional Way
		//declearing an array .All elements have the default value
		int[] numbers = new int[5];
		
		//initializing values for array elements
		numbers[3]=9;
		numbers[2]=8;
		numbers[1]=7;
		numbers[0]=5;
		numbers[4]=20;
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//Printing the element with index 2, third element
		System.out.println("Printing using index with variable");
		int i=2;
		System.out.println(numbers[i]);
		i++;
		System.out.println(i);
		
		int arrayLength=numbers.length;
		System.out.println("The size of the array is "+ arrayLength);
		
		//using for loop. This itererates from start to end
		for(int j=0; j<=4; j++) {
			System.out.println(numbers[j]);
			i++;
			//System.out.println([i]);
		}

			System.out.println("Using for loop");
			for(int j=0; j<5; j++) {
				System.out.println(numbers[i]);
			}
		// Using for-each/for loop/enhanced for loop/ enhanced for loop
			//this method iterates the whole array
			for(int number:numbers) {
				System.out.println(number);
			}
		//2nd pprofessional way of initializing array
			System.out.println("Second way using curly bracekets");
			int [] numbers2 = {4,6,8,9,15}; 
			System.out.println("Size is "+numbers2.length);
          
			
			System.out.println("For Loop");
			for(int j=0; j<numbers2.length; j++) {
				System.out.println(numbers2[j]);
			}
			System.out.println("Enhanced For Loop");
			for(int number:numbers2) {
				System.out.println(number);
				
			}
	}

}

