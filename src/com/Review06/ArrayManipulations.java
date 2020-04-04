package com.Review06;

public class ArrayManipulations {

	private int[] arr;
	public int largestNumber (int []array) {
		int largest = array[0];
		for(int i=0; i<array.length; i++) {
		  if(array[i]>largest) 
			  largest =array[i];
		}
	
		return largest;
	}
	
	//returning smallest number
	int smallestNumber(int [] array) {
		int smallest =array[0];
		for(int num:array) {
			if(num<smallest) {
				smallest = num;
			}
		}
	return smallest;
	}

	//find the avarage of array
	//even if it is private it can be call from inside the class
	private static double findAverage(int [] array) {
		double sum = 0;
		for(int num: array) {
			sum+=num;
			
		}
		return sum/array.length;
	}
	
	private static int sumArray(int [] array) {//sum of array
		int sum=0;
		for(int nums: array) {
			sum+=nums;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {5,2,9,6,1,8};
		
		double avg =findAverage(arr);//static method ;i do not need to call class name bec it is already in the class
		System.out.println("average is "+avg);//no need to create object because it is static method
		
		
		
		ArrayManipulations manip = new ArrayManipulations();
		int largest =manip.largestNumber(arr);//call the largestNumber method from above
		System.out.println("Largest is "+largest);
		
		
		int min = manip.smallestNumber(arr);
		System.out.println("smallest is "+manip.smallestNumber(arr));
	
	//Hw 
	//create a method that returns the sum of array
	   int sum= sumArray(arr);
	   System.out.println(sum);
	}
}
