package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {
		//TASK 1
		//1.Create a 2D array where you will store the following values;Mr,Mrs,Ms,Miss and 
		//Smith, Jordan, jackson,Obama and printh the following
		// Mrs Smith,Mr Obama,Ms Jackson, Miss Jordan
		
		String [][] names= {
				           {"Mr", "Mrs","Ms","Miss"},
				           {"Smith", "Obama", "Jackson", "Jordan"},
		                   }; 
		
		System.out.println(names[0][1]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+ names[1][1]);
		System.out.println(names[0][2]+" "+ names[1][2]);
		System.out.println(names[0][3]+" "+ names[1][3]);
		
		
		//TASK 2
		//Create a 2D array that first row will contain 4 names and 
		//second row will contain grades. Then, your prog should print name of the students 
		//that has A and B grade
		
		String[][] namesGrade= {
				               {"Jake" ,"Adam", "Sophie","Aise"},
				               {"A", "B", "C", "D"}		
		                       };
		
		System.out.println(namesGrade[0][0]+"`s grade is "+namesGrade[1][0]);
		System.out.println(namesGrade[0][1]+"`s grade is "+namesGrade[1][1]);
		
		
		
		

	}

}
