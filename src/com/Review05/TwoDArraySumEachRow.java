package com.Review05;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		int[][] num = {{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		
		int[] sum=new int[num.length]; //3 array there are so we say num.length
		//enhanced loop ile butun elements leeri print etme
	     for(int[]roww:num) { //each row is 1 array
	    	 
	    	 for(int element:roww) { //iterate every number in each row
	    	 } 
	    	 
	    	 System.out.println("-------regular for loop ile sum of each row------");
	    	 //regular for loop ile sum of each row
	    		 for(int row=0; row<num.length; row++) {
	    			 
	    			 for(int col=0; col<num[row].length; col++) {
	    				 
	    				 int element =num[row][col];
	    				 sum[row]+=element;
	    			 } 
	    			 }
	    			 for(int element :sum) {
	    				 System.out.println("Sum is "+element);
	    		 }
	    		 
	    	 }
	     }

	}

