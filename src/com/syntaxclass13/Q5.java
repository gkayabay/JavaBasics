package com.syntaxclass13;

public class Q5 {

	public static void main(String[] args) {
	    
		/* Reverse String character by character 
		 * word by word
		 */
		
		String given = "I love Java";
		String reversed= "";
		for(int i=given.length()-1; i>=0; i--) {
			reversed=reversed+given.charAt(i);
			
		}
			
		System.out.println("Reversed String ="+ reversed);// harf harf
		
		///////////////////////////////////////////////////////
		
		String[] array =given.split(" "); //word by word
		String reverseWords= "";
		
		for(int i=array.length-1; i>=0; i--) {
			reverseWords=reverseWords+array[i]+" ";
			
		}
		
		System.out.println("Reversed String word by word ="+reverseWords);
		
		}
	}


