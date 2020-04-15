package com.syntax.class26;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
	//Integer	num=10;//this value is presented of the Integer type. num is referring the object 
              		//10 is stored in num and representing as in Integer Type
	int i =10;
	Integer	num=10;
	
	//auto boxing
	String s = num.toString();
	System.out.println(num.MIN_VALUE);
	
	Byte b  = 90;
	System.out.println(b.MIN_VALUE);
	System.out.println(b.MAX_VALUE);
	String s1 = b.toString();
	System.out.println(s1);
	
	
	Boolean bool = true; 
	//auto unboxing	
	boolean b1 = bool;
	}

}
