package com.Review05;

import java.util.Arrays;

public class PracticeSmallest {

	public static void main(String[] args) {

		int [] numbers = {5, 18,157,32, 67, 98};
		
		Arrays.sort(numbers);
		
		System.out.println("Smallest number ="+ numbers[0]);
		System.out.println("Largest number ="+numbers[numbers.length-1]);
		System.out.println("Second largest ="+numbers[numbers.length-2]);
		
	}
 
}
