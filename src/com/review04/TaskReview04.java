package com.review04;

import java.util.Scanner;

public class TaskReview04 {
 
	public static void main(String[] args) {
		// use scanner to ask for the size of the array then read numbers from the scanner into the array 
		//then print the whole array
		
		Scanner scan =new Scanner(System.in);
		int [] num=new int[5];
		
		System.out.println("Please enter the size of the array");
	
		for(int i=0; i<num.length; i++) {
			num [i]=scan.nextInt();
		}
		for(int j=0; j<num.length; j++) {
			System.out.println(num[j]);
	
			//teacher`s way
			System.out.println("How many elements do you want?");
			int size =scan.nextInt();
			System.out.println(size);
			//I am creating an array the size that is asked for me
			int[] nums= new int[size];
			
			//This for loop inserts numbers into array
			for(int i=0; i<size; i++) {
				System.out.println("Give me an array to store in the array!");
				int nums[i]= scan.nextInt();
			}
			System.out.println("Let`s see what you gave me:");	
			//This enhanced for loop reads numbers from the array
			for(int n:nums) {
				System.out.println(n);
			}
}
}
}