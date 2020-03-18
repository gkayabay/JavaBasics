package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {
		//to get substring from a given String
		////substring = String inside your String
		
		System.out.println("--------Substring() Function-------------");//get the part from the bucket
		
		String str="Today is a rainy day";
		//1st way of substring
		String partialString=str.substring(6);//starts from index 6 go to until the end. 6. element den basla sonuna kadar al
		System.out.println(partialString);//is a rainy day
		
		//rainy day
		partialString= str.substring(11);
		System.out.println(partialString);//rainy day
		
		//2nd way of substring
		//Today
		partialString = str.substring(0,5);
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11,16);
		System.out.println(partialString);
		
		
		
		
		

	}

}
