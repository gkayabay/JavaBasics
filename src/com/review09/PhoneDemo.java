package com.review09;

public class PhoneDemo {

	public static void main(String[] args) {
	
		Phone p1 = new Phone("2345678", "iphone", "Password");
		p1.price= 1200;
		System.out.println("The price of the phone is "+p1.price );
		
		p1.displayInfo();
		
		System.out.println("---------=Getting the brand-------------------");
		String brand =p1.getBrand();
		
		//I cannot Set the brand because there is no setter 
		
		System.out.println("-------------Getting serial number---------------");
		
		//p1.serialNumber = "bla bla bla"; //since serialNumber is private 
		String serial =p1.getSerialNumber("Ellion123");
		System.out.println(serial);
		
		serial = p1.getSerialNumber("password123");
		System.out.println(serial);
		
		
		System.out.println("------------Seting the serial Number---------------");
		//p1.serialNumber ="bla bla bla";
		p1.getSerialNumber("SR12345");
		
		p1.displayInfo();

	}

}
