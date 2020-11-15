package com.oops;

public class TestInheritance {

	public static void main(String[] args) {
	
		//create obj of teacher class
		School teacher = new Teacher();
		teacher.name = "John";
		teacher.lastName = "Brown";
		School.schoolName="Timber Middle School"; //reference class School oldugu icin Schoolun variable and methodslarini kullaniyoruz
		
		//can we have access teacherId-->NO --> Because our reference
		//while creating the teacher is School Class
		
		School chemistryTeacher = new ChemistryTeacher();
		
		chemistryTeacher.name = "Jimmy";
		chemistryTeacher.lastName = "Johns";
		
		//no neeed to initialize schoolName again since it is static 
		//variable and initialized previously
		
		School.schoolName = "Harvard University";
		Teacher chemTeach = new ChemistryTeacher();
		chemTeach.teacherId = "CT1234";
		
		//doExperiment() method will not be avaliable for us
		
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.doExperiment();
	
		
		

	}

}
