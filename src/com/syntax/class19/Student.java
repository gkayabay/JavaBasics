package com.syntax.class19;

public class Student {
	static //Task1-Write program as a Student class   that has instance variables name 
	//and address. Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.
	
	String name;
	static String adress;
	
    
	public Student(String name, String adreess) {
		this.name = name;
		this.adress = adress;	
	}
	public void displayiInfo() {
		System.out.println("Student name is "+ name+ " and adress is "+adress);
	}
	
	
  public static void main(String[] args) {
	  Student student1= new Student(name, adress);
	  student1.name = "Jane";
	  student1.adress = "12 Main Str. Boston, MA";
	  student1.displayiInfo();
	  
	  Student student2= new Student(name, adress);
	  student2.name = "Adam";
	  student1.adress = "21 Main Str. Boston, MA";
	  student2.displayiInfo();
	}

}
    

