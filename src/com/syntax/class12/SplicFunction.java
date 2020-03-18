package com.syntax.class12;

public class SplicFunction {

	public static void main(String[] args) {
		System.out.println("---------split() Function-----------");
		
		String today ="Today is my favorite Java Class";
		String [] array=today.split("my");//when you see my cut it cut and put into one container as an array
        System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1= "Today is my favorite Java Class";
		
		String[]stringArray =today1.split("a");
		//print all elements from array 1 by 1
		//(element type variableName: name of array
		for(String arr:stringArray) {
			System.out.print(arr+"|");
		}
		System.out.println("--------------------");
		//print String word by word
		String today2="Today is my favorite Java Class";
		String[] words= today2.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
			
		System.out.println("---------Trim--------------------------");
		String today3="Today is my favorite Java class";
		today3=today3.trim();
		System.out.println("String after trimming:"+today3);
		
		//today3=today3.split(" ")--->CE compilation error
		
		
		}
	}

}
