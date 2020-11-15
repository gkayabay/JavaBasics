package com.gulbahar.practices;

import java.util.Scanner;

public class PrimeNumsSecondWayWithScanner {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		num= scan.nextInt();
		
		if((num % num==0)&& (num % 1==0)) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is NOT a prime number");
		}

	}

}
