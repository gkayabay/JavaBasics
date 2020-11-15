package com.gulbahar.practices;

public class PalindromePractice {

	public static void main(String[] args) {
	
	
	//Palindrome: it can be a word,number, 
	//phrase or other sequence of characters which reads the same backwards as forwad.
	//Examples: "Hannah", "racecar", 454, 101 etc..
		
		String word = "Hannah";
		String reverse= "";
		
		for(int i= word.length()-1; i>=0; i--) {
			reverse = reverse+word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			System.out.println(word + " is a palindrome");
		}else {
			System.out.println(word+ " is NOT a palindrome");
		}
		
		}

	}
