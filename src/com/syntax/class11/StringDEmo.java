package com.syntax.class11;

public class StringDEmo {

	public static void main(String [] args) {
		
		String school="Syntax";
		String str=new String("HELLO");
		String str1="This is aString 7676,&^&^";
		
		//how many characters String has
		System.out.println("--------Length Function----------");
		System.out.println(school.length());
		
		int size=str.length();
		System.out.println("String length is "+size);
		
		//convert String to lowercase or Uppercase
		System.out.println("---------ToUpperCase and ToLowerCase Function-------");
		System.out.println(school.toUpperCase());
		System.out.println(school.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		System.out.println("---------Conactinatinate Function---------- ");
		//concatinate 2 string
		String newString= str+school;
		System.out.println(newString);
		
		
		String day= "Saturday";
		String date="14";
		
		String newDate=day.concat(date);//2 string i birlestirdiginde name.concat(2nd variable)
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give CE, 
		//since concat() method is used to attach 1 string to another String
		//str2.concat(grade);
		
		System.out.println("-----------isEmpty Function-----------");
		//tells true if there is no characters inside the string
		//tells false if any caharacters are inside the string
		String str3="uuuuu889";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("-----------Trim Function(Take out empty space or cut)-------");
		//removes empty/white space at the beginning and end of the string
		String str4="   Welcome to Syntax   ";//take my string cut out empty spaces beginning and at the end of string and reassign 
		
		str4= str4.trim();
		System.out.println("String with no leading or trailing spaces:"+str4);
	
		
	}

}
