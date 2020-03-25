package com.syntax.class16;

public class Employee {
	
	int eID;
    double salary;
	static String CEO= "Sumair";
	
	public static void main (String []args) {
		
         Employee worker1= new Employee ();
         worker1.eID=145;
         worker1.salary=129.000;
        
         Employee worker2= new Employee ();
         worker2.eID=107;
         worker2.salary=150.000;
         
         Employee worker3= new Employee ();
         worker3.eID=571;
         worker3.salary=170.000;
	}

	
	void gettingSalary () {
		System.out.println("My employee ID is: "+eID+" my salary is: "+salary+" and ceo is ");
	}
}
	
		


