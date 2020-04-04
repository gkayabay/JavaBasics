package com.syntax.class21;

public class JavaTeacher extends Teacher {
	//compiler will try to create default constructor and 
	//make a call inside to parent class default constructor
	//JavaTeacher(){
	//	super(){
			
	String certifications;
	
		JavaTeacher(String name, String lastName,String certifications) {
			super(name,lastName); //using super to call parent class constructor to initilaize the varaibles
	        this.certifications = certifications; //initilazed certifications happened here
		}
	        JavaTeacher(String name, String lastName) { //super always must be firstline inside your constructor
	        	super(name, lastName);
	        
	}
}
