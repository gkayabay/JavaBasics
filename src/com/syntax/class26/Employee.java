package com.syntax.class26;

public class Employee {
	//define private variables 
	private String name;    //I am encapsulation my variables here
	private int age;
	private double salary;
	
	//Define public methods to give an access to private variables
	//getters
	public String getName() { //I want to give you return name. I am giving the access my private variables
		return name;           //I am giving out the only read access
	}                           
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
    //Setters (I am giving the write access, set specific value to your varaibles).Anyname i gave will initialize.With help of setter I GAVE an access to my varaible only if you pass my verification then you will initilaize varaibeels and write acess
	public void setName(String name) { 
		if(!name.isEmpty() && name.length()>3) { //passing validation happans here
		this.name= name;  //to initialize my variable
		}	
	}
	public void setAge(int age) {
		if (age>1) {
		this.age= age;
	}
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
