package com.syntax.class22;

public class OverloadingMain {
	
	static String str = "Syntax";
	
	public static void main(int [] args) {
	System.out.println("Method with int array arguments");
	}
	public static void main(String args) {
		System.out.println("Method with String arguments");
		}
	public static void main(String args, String args1) {
		System.out.println("Method with 2 String arguments");
	}
	public static void main(String args, int num) {
		System.out.println("Method with 1 String and int arguments");
	}
	public static void main(int num, String args) {
		System.out.println("Method with 1 String and int arguments");
	}
	
	
	public static void main(String[] args) {//Java always looks for this main method with this signature
		System.out.println("Method with String array arguments");//when java execute looks for main method and looks for signature method and matters for java
	
	OverloadingMain.main("str");//calling method by the className
	main("str");//calling method directly.   //find this method that has only 1 string
	main("hello", "hi");
	//int [] arr = new int[2];
	main(new int [2]); //arr in yerine direct new in[2] degeri verdi
}
}
