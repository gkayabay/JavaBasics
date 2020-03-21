package com.Review05;

import java.util.Arrays;

public class SecondLargestNuminArray {

	public static void main(String[] args) {
	 
		int[] numbers = {32, 61,16,89,74,25};
		
		//1st way
		Arrays.sort(numbers);
		System.out.println("Smallest "+numbers[0]); //baslangici smallest kabul etti
		System.out.println("Biggest "+numbers[numbers.length-1]);//ensonuncuyu largest kabul etti
		System.out.println("Second largest "+numbers[numbers.length-2]);//sonuncudan 2.yi second etti

		
		//2nd way
		int[] numbers2 = {32, 61,16,89,74,25};
		
		int smallest =numbers2[0];
		int largest = numbers2[0];
		int largest2 =numbers2[0];
		for(int i=0; i<numbers2.length; i++) {
			int element= numbers2[i];
			
			//check if it is bigger than the largest 
			if(element > largest) {
				largest = element;
				largest2 =largest;
				largest=element;
			}else if (element>largest2) { //check if it is bigger than second largest
				largest2 =element;
			}
			if(element<smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest is="+ smallest);
		System.out.println("Largest is = "+ largest);
		System.out.println("Second largest is ="+largest2);
	}

}
