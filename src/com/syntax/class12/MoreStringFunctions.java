package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		//replace old value with new value
		System.out.println("----------Replace() Function------------" );
		String newString=me.replace("a", "c");
		System.out.println(newString);
		
		//if it finds matching char sequence--->then replace
		me=me.replace("good", "great");
		System.out.println(me);
		
		//if it is not finding matching sequence--->not replace
		me=me.replace("Great", "Awesome");
		System.out.println(me);
		
		String car="I have a Toyota";
		car=car.replace("Toyota", "Lexus");//reassign yapiyor
		System.out.println(car);
		
		String str3="Hello all students";
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
		
		System.out.println("---------replaceAll Function------------");
		
		String str="Phone number is 1234567890";//replace all Capital characters from A to Z
		str= str.replaceAll("[A-Za-z]", " ");     //a-z replace butun lower case
		                                       //A-Za-z replace butun buyuk ve kucuk harfleri
		System.out.println(str);
		
		
		String str1="Hello12347**&&&   !!!89";
		str1.replaceAll("[0-9]","A"); //replace numbers from 9 to 0 and place A yerine
		System.out.println(str1);
		
		str.replaceAll("[^A-Za-z]",""); //replace  everything  not letters print this(Harflerin disinda kalanlari replace yap)
		System.out.println(str1);       // ^ means NOT
		
		String str2="Hello123^&^&^&^&^!";
		str2=str2.replaceAll("[A-Za-z0-9]", "");
		System.out.println(str2);
		
		String subject="Java";
		subject=subject.replace("a", "e").replace("J","I").toUpperCase();
		System.out.println(subject);
		
		
		
	}

}
