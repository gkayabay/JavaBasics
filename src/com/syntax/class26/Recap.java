package com.syntax.class26;

public class Recap {
	public static void main(String[] args) {
	
	int num = 10;
	Doctor doc = new Doctor ();
	
	int [] numbers = {10, 20,30,40};//storing group of values
    
	Doctor [] doctors = {new Doctor(), new Doctor(), new Doctor()};//creating doctors of array Doctor type
	
	String [] names = new String[2]; //another way of storing array
	names[0] = "Vital";
	names[1]= "Ghulam";
	
	System.out.println("---------------------------------------------");
	//During runtime Java will give an exception because arrays are fixed in size
	//names[2] = "Jawid"; //we cannot go and add another name inside array so java gives an exception error
}
}
