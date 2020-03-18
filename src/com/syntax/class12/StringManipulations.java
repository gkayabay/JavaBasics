package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str ="Good Morning Students";
		
		char letter1= str.charAt(0);//saymaya 0 dan baslar.
		System.out.println(letter1);
		
		char letter5= str.charAt(4);
		System.out.println("Letter at index 4 is "+ letter5+".");
		
		//char someletter=str.charAt(55);//Runtime exception --->StringIndexOutofBoundException
		//System.out.println(someletter);
		
		//get all characters 1 by 1 from a String
		char letter;// decleare the bucket
		for(int i=0; i<str.length(); i++) {//i want to loop from the begin to the end of length
			letter =str.charAt(i);
			
			System.out.print(letter+" ");//"G, o, o,d ,m....
			
			System.out.println("------indexOf() Function----------");//index sayisini soruyor
			
			String name="Syntax Technologies";
			
			int index=name.indexOf("y");
			System.out.println(index);
			
			index=name.indexOf(" ");
			System.out.println(index);
			
			index=name.indexOf("Syntax");
			System.out.println(index);
			
			index=name.indexOf("!");
			System.out.println("Index of not existing character"+index);
			
			index=name.indexOf("Technologies");
			System.out.println("Index of substring Technologies="+index);
			
			
			index = name.indexOf("o");
			System.out.println("Index of first o="+index);
			
			index = name.lastIndexOf("o"+12);
			System.out.println("Index of last o="+index);
			
			
			
		}
		
		
		

	}

}
