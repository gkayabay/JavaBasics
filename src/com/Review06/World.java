package com.Review06;

public class World {

	public static void main(String[] args) {
	
		Baby baby1 = new Baby();
		baby1.cry();
		
		baby1.firstName = "John";
		baby1.lastName = "Smith";
		baby1.gender = 'M';
		baby1.weight = 7;
		baby1.hairColor ="Yellow";
		
		//reassign value
		baby1.weight =8;
		
		System.out.println("Baby1 first name is "+baby1.firstName);//calling bbay firstname
		String babyLastName= baby1.lastName;//get baby firstname and assigning to a local variable
		
		System.out.println("Baby lastName is "+babyLastName);
		String cryVariable =baby1.cry();
		System.out.println(cryVariable);
		baby1.cry();
		baby1.talk(3);
		baby1.walk();
		
		System.out.println("\n--------------Done with baby 1-------------------");
		
		Baby baby2 = new Baby();
		System.out.println(baby2.cry());
		baby2.firstName = "Ann";
		baby2.lastName ="Atasoy";
		baby2.gender ='F';
		baby2.hairColor ="Black";
		baby2.weight = 6;
		
		System.out.println("Full name of baby2 is "+baby2.firstName + baby2.lastName);
		
		System.out.println("---------------------------------");
		//baby1.displayBabyInfo();
		
	}
}

