package com.gulbahar.practices;

public class Main {
	
	
		class Retiree extends Person{
			  
			  String seniorActivity;
			  
			     void print(){
			    
			    System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
			  }
			  
			}
		
		class Student extends Person{
			  
			  int grade;
			  
			   void print(){
			    
			    System.out.println(name + " " + lastName + " " + age + " " + grade);
			  }
			   
			}
		
		class Employee extends Person{
			  
			  
			  int salary;
			  
			  void print(){
			    
			    System.out.println(name + " " + lastName + " " + age + " " + salary);
			  }
			}
		
		class Person{
			  
			String name;
			String lastName;
			int age;
			  
			}


		  
			public static void main(String[] args) {
				
				Employee e = new Employee();

				e.name = "Joe";
				e.lastName = "Smith";
				e.age= 35;
				e.salary = 35000;
				e.print();

				Student s = new Student();

				s.name = "Adam";
				s.lastName = "Smith";
				s.age= 15;
				s.grade = 10;
				s.print();

				Retiree r = new Retiree();

				r.name = "Frank";
				r.lastName = "Smith";
				r.age= 15;
				r.seniorActivity = "tour";
				r.print();
			}
		}

		
	
	
	

	
	
		