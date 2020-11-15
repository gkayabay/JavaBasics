package com.gulbahar.practices;

public class FibonacciNumbers {

	public static void main(String[] args) {
		//Fibonacci Numbers 
		// 1  1  2  3  5  8  13  21
		// a  b  c
        //    a  b  c
		//       a  b  c
		
		
		int a=1;
		int b=1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
		System.out.println(c);
		}
		
		System.out.println("--------------------------------------------------------------------");
		//2nd way Fibonacci
		
		int [] fib = new int[20];
		fib[0] = 1;
		fib[1] =1;
		for(int i=0; i<8; i++) {
			fib[i+2] = fib[i+1]+fib[i];
		}
		for(int i=0; i<10; i++) {
			System.out.println(fib[i]);
		}
		
		
	}

}
