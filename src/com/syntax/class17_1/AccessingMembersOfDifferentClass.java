package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfDifferentClass {

	public static void main(String[] args) {
 
		Employee emp = new Employee();
		//Employee.title = "QA Engineer";
		emp.name = "Ahmet";
		//emp.lastname --->because it is protected
		//emp.salary--->default variable ONLY can accesible within the same package
		//emp.ssn--->private
		
		Employee.method1();//to access static method1 (Class name.methodname)
		emp.method1();//not preferable
		
		//below methods not avaliable due to the restrictions
		//  emp.method2();--->protected
		//  emp.method3();--->default
		//  emp.method4();--->private
		
          
	}

}
