package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//create an arrayList with names
		
		ArrayList <String> arrayList = new ArrayList<>();//creating object of arraylist
		//adding String Object into arrayList
		arrayList.add("John");
		arrayList.add("Gulbahar");
        
		//access element from arrayList(are our dynamic array)
		String secondElement= arrayList.get(1);
		System.out.println(secondElement);
		
		//arrayList is a dynamic array
		arrayList.add("Jane");
		arrayList.add("James");
		
		
		//how to get number of elements inside arraylist?
		int size = arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hichem"); //added another string in array
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		

		arrayList.add("Hichem");
		System.out.println(arrayList);//print whole array 
		
		
		arrayList.set(1,"Ahmet"); //replace index 1 and yerine Ahmet i yaz
		System.out.println(arrayList);
		
		//how to retrieve values from arrayList 1 by 1?
		for(int i=0; i<arrayList.size(); i++) {
			String element = arrayList.get(i); //getting all elements from the arraylist
		    System.out.println(element);
		}
		
		System.out.println("------------------------");
		 //2nd way doing with Advanced loop- reaching the every elements in the arrayList
		
		for(String str :arrayList) { 
		System.out.println(str);
		
	}
	}
}

