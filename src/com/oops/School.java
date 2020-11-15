package com.oops;

public class School {
	
	String name, lastName;
	static String schoolName;
	
	public void educate () {
		System.out.println(schoolName + " educates middle school students");
	}
	
	public void printDetails () {
		System.out.println("School name : "+ schoolName);
		System.out.println("Name :"+name);
		System.out.println();
	}

}
