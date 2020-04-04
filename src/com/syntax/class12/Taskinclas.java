package com.syntax.class12;

public class Taskinclas {

	public static void main(String[] args) {
	   
		//Task1
		String str= "Colors of the world";
		str= str.replace(" ",""); 
		 
		//Task2
		String str1= "Everthing will be awesome!123^&";
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1.length());
		
		
		//Task3
		String a="Is it Saturday?, Is it raining?, Do we have a Java Class today?";
		String [] sentence=a.split(",");
		System.out.println(sentence.length);
		
		
		  
		

	}

}
