package com.Review06;

public class FamilyDemo {
 
	public static void main(String[] args) {
	JamesMember.lastName ="James";
	//JamesMember.firstName ="John"; //it gives eeror because it is non static variable
	//I have to create object first
		
	JamesMember member1 = new JamesMember();
	member1.firstName ="Lebron";
	member1.lastName ="James";
	member1.age = 34;
	
	
    JamesMember member2 = new JamesMember();
    member2.firstName ="Savanah";
    member2.lastName ="James";
    member2.age = 34;
	
	member1.FullName();
	member2.FullName();
	
	
	}
}
