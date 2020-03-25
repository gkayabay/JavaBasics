package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		
		String name ="John"; //local variable that visible only within method it was decleared
	}
	public static void main(String[] args) {
		
		//System.out.println(name);CE name wont be visible to another method
		//since its scope only within nameInside method
	LocalVariables obj = new LocalVariables();
		
	boolean flag=true;
	
	if(flag) {
		String answer="Yes";
	}
	
	//System.out.println(answer);CE: scope of variable is not visible outside if block (answer if condition in oldugu method icinde bulunur disinda bulundugu icin CE verir)
	
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	}
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	
	}
}
