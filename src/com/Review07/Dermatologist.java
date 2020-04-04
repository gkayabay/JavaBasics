package com.Review07;

public class Dermatologist extends Doctor {

	String dermaId;
  
	

		//super();//calling default parent constructor
		public  Dermatologist(String name, String licenseID, int salary, String Adress) {
	     super(name, licenseID,salary); //call parent(doctor) constructor has 3 parameter name, licenseid and salary
		 //this.name= name;
	     //this.licenseID=licenseID;----->instead of using these 3 steps use super(name,licenseId, salary)
	     //this.salary = salary;
	     this.dermaId=dermaId; //initialize the dermaID
			
	}
		
	public void skinTest() {
		
	}
	//Method overloading
	public void chargePatient() {
		System.out.println("Let me charge $100.");
}
}
