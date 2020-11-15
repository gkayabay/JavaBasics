package com.review09;

public class Phone {
	//private variables 
	private String serialNumber;
	private String brand;
	private String password;
	
	//public variable
	double price;
	
	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
	}
	
	public void displayInfo() {
		System.out.println("This is a "+this.brand+" phone with serial number "+serialNumber);
	    System.out.println("It costs $ "+price);
	}
	
	//Getters and Setters 
	//I will give you the serial number 
	//if you give me the correct pasword
	public String getSerialNumber(String password) {
		String result ="";
		if(this.password.equals(password)) {
		result= serialNumber;
	}else {
		result = "Invalid Access!";
	}
		return result;
	}

	
	//you will be able to change the serial number 
	//only if you give me a 7-digit string
	public void setSerialNumber(String serialNumber) {
		if(serialNumber.length()==7) {
		this.serialNumber = serialNumber;
	}
	}
	//Brand is view only
	public String getBrand() {
		return brand;
	}

}
