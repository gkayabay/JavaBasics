package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1= "Welcome Syntax students";
		
		String str2= "Welcome Syntax Students";
		
		//to compare 2 Strings
		System.out.println("-------equals() equalsIgnoreCase() Function---------");

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//ikiside ayni ise ignore ediyor buyuk kucuk harfi onemsemiyor
	    
		String expected = "Home - Syntax Technologies";
		String actual = "Home - Syntax Technologies  ";
		
		
		//
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Title are NOT matched");
		}
		
		System.out.println("----------First Trim Then COMPARE---------------");
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Title are NOT matched");
		}
		
		String browser ="Chrome"; 
		if(browser.trim().equalsIgnoreCase("chrome")) { //justincase first trim yap then compare if it equals
			System.out.println("Test executed on chrome browser");
		}
		//OR
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on chrome browser");
	
	
		}
	}

}
