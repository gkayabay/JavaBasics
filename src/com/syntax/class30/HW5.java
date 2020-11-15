package com.syntax.class30;

import java.util.*;
public class HW5 {

	public static void main(String[] args) {
	//Create a collection of integers in which you can keep duplicates. 
    //Write a logic to find sum of all integers

	List<Integer> nums = new LinkedList<>();
	nums.add(10);
	nums.add(12);
	nums.add(28);
	nums.add(40);
	nums.add(45);
	nums.add(45);
	nums.add(10);
	
	int sum = 0;
	
	for(int n: nums) {
		sum= sum+n;
	}
	System.out.println(sum);
	}

}
