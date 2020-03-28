package com.syntax.class18;

public class Recap {
	//Task 1
	protected int sumFromArray(int [] array) {
		int total=0;
		for(int i=0; i<array.length; i++) {
			total+=array[i];
		}
		return total;
	}
	
	
     //Task2
	public static String getReverse(String str) {
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
	return reverse;
	
	}
	
	
	//Task 3
	private static String getVowels(String str) {
	String vowels;
	vowels= str.replaceAll("[^aeiouAEIOU]", ""); {
	}
	return vowels;
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		int [] array = {2,7,19,857};
		System.out.println("total"+ obj.sumFromArray(array));
		
		String str =Recap.getReverse("Hello");//calling by class name
		System.out.println(str);//calling by object name
		
		String vowels =getVowels("Hello");
		System.out.println(vowels);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
