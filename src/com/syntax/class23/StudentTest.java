package com.syntax.class23;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("-------Student object and Reference Student Type---");
		Student student = new Student(); //obj of the Student Class
		student.study();
		student.doHomework();
		
		System.out.println("-------Student object and Rerefence SyntaxStudent Type---");
		SyntaxStudent syntax = new SyntaxStudent();
		syntax.doHomework();//from parent class
		syntax.study();
		syntax.accesParentOverridenMethod();
		syntax.getJob();
		
		
		System.out.println("-------SyntaxStudent object and Student Reference Type---");
		Student st = new SyntaxStudent();//upcasting (assignin child object)
		st.study();  //this method avaliable in SyntaxStudent yes, ok execute from SyntaxStudent
		st.doHomework();//this method NOT avaliable in SyntaxClass then goto Parent class (STUDENT) , then execute doHW from parent class
		
		
		
	}
	

}
