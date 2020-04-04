package com.syntax.class20;

public class Doctor {
	
	int doctorId;
	String name;
	
	public Doctor (String name, int doctorId) {//to pass parameters
		this.name=name;
		this.doctorId = doctorId; //to initialize variabless yapildi
	}
}
	
	class Dentist extends Doctor {
		String lastName;
		Dentist(String name,String lastName, int doctorId) {
		//compiler will try to make a call to parent class constructor
		super(name, doctorId);      //to execute parent constructor
	    this.lastName=lastName;
	}
		public void display () {
			System.out.println("Dentist name is "+ name+" and doctorId is "+doctorId);
		}
}
