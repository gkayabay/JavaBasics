package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//create an arrayList to store numbers
		
		ArrayList<Integer>numbers = new ArrayList<>(); //ArrayList class implement the metods
		//autoboxing
		numbers.add(10);//adding primitive type and storing into Integer type
		
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(2));//to print the only one index which is index 2
		System.out.println(numbers.contains(30));//is ArrayList contains 30 
		System.out.println(numbers.isEmpty());
		
		
		for(int i = 0; i<numbers.size(); i++) {
			int num = numbers.get(i);//autounboxing->you have the object type(numbers) and stored it into int type
		}
		System.out.println("---------------");
		for(int num:numbers) {
			System.out.println(num);
			
		}
		
	}
	

}
