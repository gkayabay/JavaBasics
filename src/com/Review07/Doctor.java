package com.Review07;

public class Doctor {
	static String hospitalName;
	String name;
	String licenseID;
	int salary;
	
	//one more variable added
	String adress;
	
	public Doctor() {
//		super (); //defualt constructor
	}
	
	
	public Doctor(String name, String licenseID, int salary) {
		//super() //I am calling super() by default
		this.name = name;
		this.licenseID=licenseID;
		this.salary= salary;
	}

	public Doctor(String name, String licenseID, int salary, String Adress) {
		this(name, licenseID, salary);//has a 3 parameter constructor method		
//		this.name = name;
//		this.licenseID=licenseID; ---->bu 3 steps in yerine this(name, licenseId, salary);as a constructor that we do not repeat it
//		this.salary= salary;
		this.adress = adress; //adress is initialized here
	}
	
	
	public void checkUp(String patientName) {  
		System.out.println("Doctor "+name+" has ordered blood test for "+patientName);
	}
		
	public void treatPatient(String patientName) { //patientname is local variable	
		checkUp(patientName); //3 methods in treatPatient method
		System.out.println("Doctor "+this.name+" gives prescription to "+patientName);
	    //"name" belongs to the object. 
		this.chargePatient();
	}
	
	public void chargePatient() {
		System.out.println("Let me charge $100.");
	}
	public void displayInfo () {  //this method prints everything together
		System.out.println("Doctor "+name+" with licenseID "+" has a salary "+salary+" works for "+hospitalName);
	}
	public static void payBills() {
		//non static variables cannot be used
		//System.out.println("Doctor"+name);
		
		//static variables can be used 
		System.out.println("Everybody pays bills.");
	}
}
