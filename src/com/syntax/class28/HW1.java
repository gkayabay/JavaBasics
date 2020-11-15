package com.syntax.class28;

import java.util.ArrayList;

public class HW1 {

	public static void main(String[] args) {
	        //using set example 
			ArrayList<String> drinks = new ArrayList<>();
			drinks.add("water");
			drinks.add("milk");
			drinks.add("juice");
			drinks.add("tea");
			drinks.add("coffee");

			for (int i = 0; i < drinks.size(); i++) {
				if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
					drinks.set(i, "water");//replace element i, place water.(set method is preferable than replace ALL)
				}
			}
 
			System.out.print(drinks);
			
			//2nd Example using replaceAll method
			System.out.println("--------------------");

			ArrayList<String> drink = new ArrayList<>();
			drink.add("Coce");
			drink.add("Bilo-Colo");
			drink.add("Kakao");
			drink.add("Seltser");
			drink.add("Apple sok");
			drink.add("Orange juice");
			drink.add("Coconut sok");
			drink.add("Mango juice");
			
			for (String dr : drink) {
				dr = dr.toLowerCase();
				if (dr.contains("a") || dr.contains("e")) {
					dr = dr.replaceAll(dr, "Water");
				}
				System.out.println(dr);
			}
			System.out.println(drink);
		}
	}

	