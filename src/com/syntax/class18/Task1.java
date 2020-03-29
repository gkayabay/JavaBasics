package com.syntax.class18;

public class Task1 {
	String name;
	int grade1, grade2, grade3;
	
	Task1 (String studentName, int studentGrade1,int studentGrade2, int studentGrade3) {
     name= studentName;
     grade1 =studentGrade1;
     grade2=studentGrade2;
     grade3 =studentGrade3;
}
     public static void gradeAverage() {
    	 int total = grade1+grade2+grade3;
    	 int average =total/3;
     
     }
     public static void main(String[] args) {
		Task1 st1 = new Task1("Julie", 67,78,90);
		Task1 st2 = new Task1("Jane", 80,95,90);
		Task1 st3 = new Task1("Henry", 97,78,90);
		Task1 st4 = new Task1("Alan", 76,78,96);
		
		String str1, str2,str3,str4;
		System.out.println(str1+ " got average grade of "+str1.gradeAverage());
		System.out.println(str2+ " got average grade of "+str2.gradeAverage());
		System.out.println(str3+ " got average grade of "+str3.gradeAverage());
		System.out.println(str4+ " got average grade of "+str4.gradeAverage());
		
		
     }	
	}

	



