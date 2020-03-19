package com.syntaxclass13;

public class Q3 {

	public static void main(String[] args) {
    /*
     * write Java prog to print first 10 numbers of Fibonacci Series
     * 0 1, 2, 3, 5, 8, 13, 21
     * 
     */
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1; i<=10; i++) {
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
