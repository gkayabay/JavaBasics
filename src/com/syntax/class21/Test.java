package com.syntax.class21;

public class Test {
	
	public static void main(String[] args) {
		
		MathTeacher mt = new MathTeacher("Brian", "Quisbert");//create object of child class
		System.out.println(mt.name);
		
		MathTeacher mt1 = new MathTeacher("Sarmed", "Halabi");
		System.out.println(mt.name);
		
	    JavaTeacher	jt=new JavaTeacher ("Anna","Smith", "Java 8 Certifications");
	    System.out.println(jt.name);
	}
	

}
