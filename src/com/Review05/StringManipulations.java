package com.Review05;

public class StringManipulations {

	public static void main(String[] args) {
	     
		String str= "Hello! ";
        int length = str.length();
		System.out.println(length);
		System.out.println(str.toUpperCase());
		
		//str has not changed
		System.out.println(str);
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.equals("hello2!")); //case sensitive
		System.out.println(str.equalsIgnoreCase("hello2!"));
		
		boolean starts = str.startsWith("he");
		System.out.println("str.startsWith(he)--->"+ starts);
		System.out.println(str.endsWith(" ")); //does it ends with space?
		
		starts= str.toLowerCase().startsWith("he");
		System.out.println(starts);
		
		char fourthCharacter= str.charAt(4); //print the index 4th character
		System.out.println(fourthCharacter);
		
		String reverse ="";
		char[] charArray= str.toCharArray();// all the characters into an array
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);//!olleh ters BASIMI
			reverse +=charArray[i];	//her bir characteri array e koyup sondan basa print ediyor	
			}
		System.out.println("Reverse is-->"+ reverse);
		
		
		int index= str.indexOf("llo");
		System.out.println(index);
		
		String example = "Something inside here";
		int index2=example.indexOf("e",7);
		System.out.println(index2);
	
	}

}
