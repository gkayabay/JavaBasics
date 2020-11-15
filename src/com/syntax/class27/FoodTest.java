package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		//store food into array
		Food [] foodArray = {new Pizza(),new Fish(),new Soup(),new Desert()};
		
		//food into ArrayList
		ArrayList<Food> food = new ArrayList<>();
		food.add(new Pizza());
		food.add(new Fish());
		food.add(new Soup());
		food.add(new Desert());
		
		//call Avaliable methods using for loop, advanced for loop and iterator
		System.out.println("-------------Enhanced for loop-------------------");
		
		for(Food f:food) {
			f.foodType();
			f.taste();
			f.rich();
		}
		System.out.println("-------------using for loop-------------------");
		for(int i=0; i<food.size(); i++) {
			food.get(i).taste();
			food.get(i).foodType();
			food.get(i).rich();
		}
		
		System.out.println("-------------Using the iterator method----------");
		
        Iterator<Food> it = food.iterator();
        while(it.hasNext()) {
        Food element = it.next();
        element.taste();
        element.foodType();
        element.rich();
        }
	}

}
