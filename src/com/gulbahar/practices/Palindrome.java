package com.gulbahar.practices;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		
		String a, b = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		a = scan.nextLine();

		for (int i = a.length() - 1; i >= 0; i--) {

			b = b + a.charAt(i);

		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println(a + " is a palindrome");
		} else {
			System.out.println(a + " is  NOT a palindrome");

		}
		System.out.println("-----------------------------------");
		
		//2nd way palindrome
		String word = "Hannah";
	    String pal="";
		for(int i=word.length()-1; i>=0; i--) {
			pal = pal+word.charAt(i);
		}
		if(word.equalsIgnoreCase(pal)) {
			System.out.println(word+" is a palindrome");
		}else {
			System.out.println(word+ " is NOT a palindrome");
		}
	}

	//Palindrome: it can be a word,number, 
//phrase or other sequence of characters which reads the same backwards as forwad.
//Examples: "Hannah", "racecar", 454, 101 etc..
	
	String Word = "racecar";
	String reverse= "";
	
	for(int i= Word.length()-1; i>=0; i--) {
		reverse = reverse+Word.charAt(i);
	}
	
	if(word.equals(reverse)) {
		System.out.println(Word + " is a palindrome");
	}else {
		System.out.println(Word+ " is NOT a palindrome");
	}
	
	}

}




















