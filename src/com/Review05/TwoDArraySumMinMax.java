package com.Review05;

public class TwoDArraySumMinMax {
	
	public static void main(String[] args) {
		//iterating a 2D Array
		int[][] num = {
				{7,1,6,12},
				{9,6,2,8},
				{3,0,8,5},
		        };
		
		int rows = num.length;
		for (int i=0; i<rows; i++) {
			System.out.println("I am at row index "+i);
			
			int length = num[i].length;
			for (int j=0; j<length; j++) {
				int element =num[i][j];
				System.out.print(element+ " ");
		}
			System.out.println();
		}
		//sum of all elements in a 2D array
		int sum =0;
		//iterating rows
		for(int row=0; row<num.length; row++) {
			//iterating elements in a row
			for(int col=0; col<num[row].length;col++) {
				int element =num[row][col];
				sum +=num[row][col];
			}
			System.out.println("The sum of all number is "+sum);	
			}
		//min and max number
		int min=num[0][0]; //1st element in the array
		int max=num[0][0];
		for(int i=0; i<num.length; i++) {
			//iterating elements in a row
			for(int j=0; j<num.length;j++) {
				int element =num[i][j];
				 if(element<min)
				    min=element;   
			}
			int element = 0;
			if(element>max) {
				max=element;
		}
		}
	
			System.out.println("The min is = "+ min);
			System.out.println("The max is ="+max);
	}
}




