package com.Review05;

public class TwoDArrayDemo {

	public static void main(String[] args) {
      //1st way
		int[][] numbers= new int[3][4];
		//print third element in second row
		System.out.println(numbers[1][2]);
		
        //initialize some values for first row index 0
		numbers [1][0]=9;
		numbers [1][1]=6;
		numbers [1][2]=2;
		numbers [1][3]=8;
		
		System.out.println(numbers[1][2]);//2nd row 3rd element
		
		//2nd way
		int [][] numbers2 = {{9, 6,2,8},
				             {7,1,6,12},
				             {3,0, 8,5}
		                     };
		System.out.println(numbers2[0][3]);
		
		int row= numbers2.length;
		System.out.println("rows = "+ row);
		int length0=numbers2[0].length; //length of 1st row
		int length1=numbers2[1].length;
		int length2=numbers2[2].length;
		
		System.out.println("row0="+length0+ "row1="+length1+"row2="+length2);
		
		
		//3rd Way
		int[][] numbers3= new int[3][];
		numbers3[0] = new int[4];
		numbers3[1] = new int[4];
		numbers3[2] = new int[4];
		
		System.out.println();
		
		}
		
	}


