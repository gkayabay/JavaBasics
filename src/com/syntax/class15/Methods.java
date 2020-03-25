package com.syntax.class15;

public class Methods {

	//create a method that will say welcome 10 times
	
	void sayWelcome() {
		for(int i=0; i<=10; i++) {
		System.out.println("Welcome");
	}
	}
	//create method that will say any word #number of times
	
	void sayAnything(String word, int times) { //howmany times you want to repeat
		
		for(int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	//create a method isItRaining 
	//that will accept boolean value as a parameters
	//and based on the value it will print message accordingly
	
	void isItRaining (boolean isRain) {
		if(isRain) {
			System.out.println("It is raining stay home and learn Java");
		}else {
			System.out.println("It is not raining go for a walk");
		}
	}
	//Task 2
	void eveneOrOdd (int a) {
		if(a%2==0) {
			System.out.println(a+ " is even number");
		}else {
			System.out.println(a+ "is odd number");
		}
	}
	//isLarger or 
	void isLarger(int a, int b) {
		if(a<b) {
			System.out.println(b+" is larger than"+a);
		}else if(a>b) {
			System.out.println(a+" is larger than"+b);
		}else {
			System.out.println("Numbers are even");
		}
		}
	
		
    //isPalindrome
	void isPalindrome(String word) {
		char[] array = word.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reverse += array[i];
		}

		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("Word is palindrome");
		} else {
			System.out.println("Word is not palindrome");
		}
	}

	void sayHello(String country) {
		switch (country.toLowerCase()) {
		
		case "russia":
			System.out.println("Privet");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		case "mexico":
			System.out.println("hola");
			break;
		default:
			System.out.println("wrong language");
		}
	}
}
	
