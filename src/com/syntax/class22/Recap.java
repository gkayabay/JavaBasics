package com.syntax.class22;

public class Recap {

	public void hello() {
		System.out.println("Hello");
	}
	public void hello(String name) {
		System.out.println("Hello");
	}
	public void hello(int num) {//CE This method is overloaded
		System.out.println("Hello"+num);
	}
		public void hello1(int num) {//CE This method is overloaded
			System.out.println("Hello"+num);
		

	//CE: overloading is not possible by changing access modifier
	//private void hello (String str)
    //System.out.println("hello"+name);
		
		
	
	//CE: overloading is not possible by cahnging return type public String hello(String name){
		return name;
	
	
}
