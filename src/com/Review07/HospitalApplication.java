package com.Review07;

public class HospitalApplication {

	public static void main(String[] args) {
		
		Doctor.hospitalName = "Hackensack Hospital";
		Doctor.payBills();//static method can be called
		//Doctor.chargePatient();non static is not allowed because you have to create the object first
		
		
		Doctor doc1;
		doc1= new Doctor("John Smith","12345",150000); //Doctor doc1 = new Doctor(); seklinde yazilsinin aynisi
//        
//		doc1.hospitalName= "New Jersey Hospital";//this is for the doct1 is not recommended becuase we have static variabel for hospital name
//		  doc1.name = "John Smith";
//        doc1.licenseID ="12345";   --->These 3lines no need anymore because it is created a new Doctor constructor we put values inside of the new Doctor constructor
//        doc1.salary= 150000;
        
		System.out.println("Doctor name is "+ doc1.name); //when we referring outside of object we call doc1.name
		
        doc1.displayInfo();
        doc1.chargePatient();
        doc1.treatPatient("Adam Smith");  
        
        Doctor doctor2 = new Doctor("Mehmet Oz","34567",400000);
        doctor2.displayInfo();
        
        Doctor doctor3 = new Doctor ("Mary James", "6789",500000, "123 Sesame St");
	    doctor3.displayInfo();
	    
	    Dermatologist dermatologist1 = new Dermatologist("Tom Hanks", "456",60000,"D123");
	    dermatologist1.name ="Rose";
	    dermatologist1.licenseID= "skf";
	    dermatologist1.chargePatient();
	    dermatologist1.skinTest();
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
