package com.syntax.class17;

public class Tasks {
	
	//TASK1
	//Create a method that will accept an array as parameters and will return a sum of all elements 
	//from that array. Method should be visibly only within same package and 
	//accessible by the creating an instance of the class.
	
	protected int array (int []a) {
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		return sum; 
	}
	public static void main1 (String []args) {
		
		Tasks obj =new Tasks();
		int[] a = {2,7,19,857};
		System.out.println("sum of array is:"+obj.array(a));
	}


	//TASK 2
	//create a method that will take a String as a parameter and returns reverse String. 
	//Method should be available to all classes 
	//within your projects and accessible by class name.
	
	public String Reverse (String s) {
		
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
		 reverse = reverse+s.charAt(i);
		}
		return reverse;
		}
	
	public static void main(String[] args) {
		
		Tasks obj= new Tasks();
	
		System.out.println(obj.Reverse("Hello"));
	}
	
	//TASK 3
	//Create a method that will accept a String as a parameter and 
	//return a new String that consist only of vowels. 
	//Method should be available inside the class where it was declared and 
	//executed by calling it is name.
	
	private  String WithVowel(String str) {
		str=str.replaceAll("[a-zA-Z&&[^aeiouAEIOU]]","");
	return str;
	}
	public static void main2(String[] args) {
		Tasks obj=new Tasks();
	System.out.println(obj.WithVowel("merhaba arkadaslar"));
	}
	}
	
		
		
		
		
	 
	
	
	
	
		

	
