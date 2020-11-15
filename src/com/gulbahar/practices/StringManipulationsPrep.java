package com.gulbahar.practices;

public class StringManipulationsPrep {

	public static void main(String[] args) {
		
		String name= "Colors of the World";
		
		int firstSpace= name.indexOf(" ");
		System.out.println("Name: "+name);
		String firstword=name.substring(firstSpace);
		
		System.out.println("Upper case: "+name.toUpperCase());
		System.out.println("Upper case: "+name.toLowerCase());
		System.out.println("First char: "+name.charAt(0));
		System.out.println("Length of string: "+name.length());
		System.out.println("Last char: "+name.charAt(18));
		System.out.println("Substring: "+name.substring(10, 19));
		System.out.println(firstword);
	}
	
 
}
