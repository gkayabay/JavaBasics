package com.syntax.class23;

public  class FinalExamples {
	
	final String str = "I love Java"; 
	
	final void saySmth(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
	   
		FinalExamples obj = new FinalExamples();
		//obj.str ="I do not like Java";CE: final variables cannot be modified or changed
		
	}
}
