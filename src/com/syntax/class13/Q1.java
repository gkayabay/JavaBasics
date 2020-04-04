package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		/* Swap  
		 * 
		 * 
		 */

		
		int a=10; 
		int b= 20;
		
		a=a+b;//30
		b=a-b;//30-20
		a=a-b;
		
		System.out.println("The value of a = "+ a);
		System.out.println("The value of b = "+ b);
		
		String str1= "Syntax";
		String str2= "Tehnologies";
		
		str1=str1+str2;//DayNight
		str2=str1.substring(0,str1.length()-str2.length());//Day
		str1=str1.substring(str2.length());//Night
		
		System.out.println("The value of str1 = "+ str1);
		System.out.println("The value of str2 = "+ str2);
		
		
		//another way
		String s1= "Hello";
		String s2 ="Bye";
		
		String shortest1= s1+s2;
		s2 =shortest1.replace(s2, "");
		s1 =shortest1.replace(s2,"");
		
		System.out.println("The value of s1 = "+s1);
		System.out.println("The value of s2 = "+s2);
		
		
		
	}

}
