package com.syntax.class29;

import java.util.*;

public class SetFamily {
	
public static void main(String[] args) {
	//HashSet does not guarantee insertion order
	Set<String>veggies = new HashSet<>();//Tree set ascending order= alphabetical order 
	veggies.add("carrot");
	veggies.add("potato");
	veggies.add("cucumber");
	veggies.add("eggplant");
	veggies.add("potato");
	veggies.add("cucumber");
	System.out.println(veggies);
	
	
	System.out.println(veggies);
	
	//LinkedHasSet guarantee insertion order
	Set<String> fruits = new LinkedHashSet<>(); //linkedHasSet ve HashSet are child of Set oldg icin No allow Duplicates 
	fruits.add("apple");
	fruits.add("mango");
	fruits.add("kiwi");
	fruits.add("tomato");
	fruits.add("banana");
	fruits.add("mango");
	fruits.add("tomato");
	
	System.out.println(fruits);
	
	//treeset store objects in ascending order(aplahbetical order)
	Set<String> food = new TreeSet<>(veggies);//add veggie collection to food collecion
	//adding duplicate objects from veggies collection
	food.addAll(veggies);
	food.addAll(fruits); //fruits collection is added inside food collection
	System.out.println(food);
}
	
	
}
