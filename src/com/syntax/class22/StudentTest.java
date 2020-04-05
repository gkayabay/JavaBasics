package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
		//Accessing methods in Parent(STUDENT classs)
		Student st = new Student();
		st.study();
		st.hasTest();
		st.classOnline();
		
		//Acessing methods in child class (SyntaxStudent class)
		
		SyntaxStudent syntx = new SyntaxStudent();
		syntx.study();
		syntx.classOnline();
		syntx.hasTest();
		
		//Acessing methods in child class (OnlineStudent class)
		
		CollegeStudent cs = new CollegeStudent();
		cs.outOfState();
		cs.payTuition();
		cs.classOnline();
		cs.study();
		cs.hasTest();
		
		//Acessing methods in child class (SchoolStudent class)
		
		SchoolStudent so = new SchoolStudent();
		so.earlyBird();
		so.lovesArt();
		so.study();
		so.hasTest();
		so.classOnline();
		
		System.out.println("-----SyntaxStudents----------");
		Student obj = new SyntaxStudent();
		obj.study(); //overriding 
		obj.hasTest();
		obj.classOnline();
		
		System.out.println("--------CollegeStudent---------");
		Student obj1 =new CollegeStudent();
		obj1.study(); 
		obj1.hasTest();
		obj1.classOnline();
		
		System.out.println("--------SchoolStudent-----------");
		Student obj2 =new SchoolStudent();
		obj2.study(); 
		obj2.hasTest();
		obj2.classOnline();
		
	}
}
