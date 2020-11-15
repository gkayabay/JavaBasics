package com.gulbahar.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repl208 {
	
	
	public static void method1(String filePath) throws FileNotFoundException{
	
	    FileInputStream fis= new FileInputStream(filePath);
		
		
		}
		
	public static void main(String[] args) {
		
			try{
				method1("");
				
			}catch (FileNotFoundException e) {
				System.out.println(e);
			}
	}
	}

