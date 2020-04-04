package com.syntax.class21;

public class ProgrammingLanguage {
	
	String name;
	String variable;
	
	public ProgrammingLanguage(String name, String variable) { //this contructor takes care of parent class(Programminglanguage class)
		this.name=name;
		this.variable= variable;
	}
	
	class Java extends ProgrammingLanguage {
		
		String constructor;
		
		Java(String name, String variable, String constructor) {
			super(name, variable);     //has to match with Programminlanguage constructor parameters yukaridaki gibi
			this.constructor=constructor;//to initialize the String constructor
		}
		public void details() {
			System.out.println(name+" can have variables "+variable+" and constructor "+constructor);
		}
		
	}
	//class JavaScript extends ProgrammingLanguage {
		 
	}
	
	

