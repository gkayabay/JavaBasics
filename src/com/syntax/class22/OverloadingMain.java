package com.syntax.class22;

public class OverloadingMain {
	
	public static void main(String[] args) {//Java always looks for this main method with this signature
		System.out.println("Method with String array arguments");//when java execute looks for main method and looks for signature method and matters for java
	}
	private static void main(int [] args) {
	System.out.println("Method with int array arguments");
	}
	public static void main(String args) {
		System.out.println("Method with String arguments");
		}
	public static void main(String args, String args1) {
		System.out.println("Method with 2 String arguments");
		}
}
