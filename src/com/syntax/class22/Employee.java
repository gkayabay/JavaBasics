package com.syntax.class22;

public class Employee {

	double salary;
	
	void getPaid() {
		System.out.println("Employee get's paid "+salary);
	}
	
	void work() {
		System.out.println("Employee works");
	}
}
class FullTimeEmployee extends Employee{
	
}
class ParTimeEmployee extends Employee{
	
}

class Contractor extends Employee{
	
	double hourlyRate;
	
	void getPaid() {//overriding behavior inside contractor child class
		System.out.println("Contractor get's paid "+hourlyRate);
	}
}

	
