package com.syntax.class26;
 
public class DoctorTest {

	public static void main(String[] args) {
	
		Doctor doc = new Doctor();
		doc.setEmail("");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@yahoo.com");//provide the email
		System.out.println(doc.getEmail());//only if the validation is passed then i will give the value of my output
		
		doc.setEmail("doctor@gmail.com"); //now you have access to write my varaible
		System.out.println(doc.getEmail());//to access my public variable
	}

}
