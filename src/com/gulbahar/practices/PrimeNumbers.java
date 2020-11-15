package com.gulbahar.practices;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		System.out.println(primeNumbers);
	}

	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	

	
	
	

////second way 
//    int num = 29;
//    boolean flag = false;
//    for(int i = 2; i <= num/2; ++i)
//    {
//        // condition for nonprime number
//        if(num % i == 0)
//        {
//            flag = true;
//            break;
//        }
//    }
//
//    if (!flag)
//        System.out.println(num + " is a prime number.");
//    else
//        System.out.println(num + " is not a prime number.");
	
	
	
	
	
    }
 
    
   

