package com.syntax.class19;

public class ThisKeyword {
	
	int a;
	int b;
	
	
	public ThisKeyword() {
		System.out.println("I am a non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a; //this.a=100;
		this.b=b;
	}
	
	public void sum(int a, int b) { //a ve b refers to local variable
	    //sum of which variable am I calculating
		System.out.println("Sum of local variable "+(a+b));//i am refering to my local varaiable
		System.out.println("Sum of instance variable "+ (this.a+this.b));//to calculate or to access instance variabels
	
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj =new ThisKeyword(10,20);//refers to instance variable
		obj.sum(100, 200);//refers to local variables 
		
		ThisKeyword obj2 = new ThisKeyword();
		obj2.sum(20,40);//60 ->accessing current local variable. a=0; b=0-->because this.a and this.b instance variables are 0
	}
}
    