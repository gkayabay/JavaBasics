package com.syntax.class14;

public class Phone {
	
	String name;
	String model;
	String color;
	long price;
	
	public static void main (String [] args) {
	Phone phone1= new Phone();
	phone1.name= "Iphone";
	phone1.model="I9";
	phone1.color= "Blue";
	phone1.price= 1299; 

	phone1.talk();
	phone1.text();
	phone1.listenMusic();
	
	Phone phone2= new Phone();
	phone2.name= "Android";
	phone2.model="A2";
	phone2.color= "Silver";
	phone2.price= 799; 
	
	Phone phone3= new Phone();
	phone3.name= "Nokia";
	phone3.model="N7";
	phone3.color= "Purple";
	phone3.price= 1500; 
	
	}
	void talk() {
		System.out.println(name+ " can talk with");
	}
	void text() {
		System.out.println(name+ " can text with");
	}
	void listenMusic() {
		System.out.println(name+" can listen music with it.");
	
	
	String str="Hello friends";
	str=str.replace("Hello", "Welcome");
	System.out.println(str);
	
	
}
}