package com.syntax.class24;

public class PhoneTest {
  
	public static void main(String[] args) {
	
	//new Phone(): CE: cannot instantiate/create an object of Phone Class because is ABSTRACT		
	
	Phone iphone = new Iphone(); //upcasting. Accesing and creating object throug child class 
	iphone.call();
	iphone.text();
	iphone.takePictures();
	iphone.playMusic();
	
	Phone samsung = new Samsung();
	samsung.call();
	samsung.text();
	samsung.takePictures();
	samsung.playMusic();
		
		
	}
	
	
}
