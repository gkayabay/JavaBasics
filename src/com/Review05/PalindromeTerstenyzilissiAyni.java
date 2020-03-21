package com.Review05;

public class PalindromeTerstenyzilissiAyni {

	public static void main(String[] args) {
	
		String str = "kayak";
		
		//1st way
		char[]charArray = str.toCharArray();
		
		String reverse= "";
		System.out.println(reverse.isEmpty());
		
		for(int i =charArray.length -1; i>=0; i--) {
			reverse += charArray[i];
			
		}
		System.out.println("word is ="+ str);	
		System.out.println("reverse is ="+ reverse);
		
		if(str.equals(reverse)) {
			System.out.println("Yes it is a palindrome");
		}else {
			System.out.println("No it is not a palindrome");
		}
	}

}
