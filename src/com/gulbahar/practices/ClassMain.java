package com.gulbahar.practices;

public class ClassMain {
	
	public static void main (String [] args) {
		ClassMain obj =new ClassMain();
		System.out.println(obj.censorLetter("computer science", 'e'));
		System.out.println(obj.censorLetter("trick or treat", 't'));
	}
		
	
		String censorLetter(String word, char star) {
			String w1= word.replace(star, '*');
			return w1;
		}
		
	}
