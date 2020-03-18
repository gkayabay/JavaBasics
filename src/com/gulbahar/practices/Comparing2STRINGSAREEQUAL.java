package com.gulbahar.practices;

public class Comparing2STRINGSAREEQUAL {

	public static void main(String[] args) {
		
		String fullName= "Laura Nil Ashley";
		String userInput= "Laura Nil Ashley";
		
		System.out.println(fullName+"\n"+ userInput);
		System.out.println();
		
		System.out.println("Are these strings equal? " +fullName.equals(userInput));//fullName is it equal to userinput. it gives boolean value(true or false
		
		System.out.println(fullName.equals("I love flowers."));
		
		String str1="Oranges are my favorite fruit";
		String str2="Apricots are delicious";
		String str3= "Insects are strange";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.compareTo(str2) >0) System.out.println("Str1 comes after Str2"); 
		if(str1.compareTo(str2) <0) System.out.println("Str1 comes before Str2"); //kucuk olan once gelir sozlukte de
		if(str1.compareTo(str2) == 0) System.out.println("Str1 is equal to Str2");
		
		
		
		
		

	}

}
