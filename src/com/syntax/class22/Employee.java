package com.syntax.class22;

public class Employee {
	
	double salary;
	
	void getPaid() {
		System.out.println("Employee gets paid "+ salary);
	}
	
	void work() {
		System.out.println("Employee works");
	}
	
	class FullTimeEmployee extends Employee { //extends is to create a relationship
		
	}
	
	class PartTimeEmployee extends Employee {
		
	}
	
	
	class Contractor extends Employee {
		double hourlyRate;
		void getPaid() { //overriding behavior inside contractor child class
			System.out.println("Contractor gets paid "+hourlyRate);
		}
		
	}
	
	
	
	

}
