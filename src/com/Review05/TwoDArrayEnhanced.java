package com.Review05;

public class TwoDArrayEnhanced {

	public static void main(String[] args) {
		int[][] num = {{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		
		//iterating rows of a 2D array
		for(int[] row:num) {
			
			//iterating elmenets of a row
			for(int element:row) {
				System.out.print(element+" ");
			}
			System.out.println();	
			}
		}
}