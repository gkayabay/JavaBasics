package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "Faisal";
		emp.lastName ="Sakhi"; //protected mmember
		emp.salary= 100000;  //default member
		//emp.ssn=789969;CE; field SSN is not visible bec it is private
		
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); CE : method4 is not visible because it is private you can access within the class

	}

}
