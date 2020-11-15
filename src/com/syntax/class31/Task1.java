package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		String filePath ="/Users/gulbahar/eclipse-workspace/JavaBasics/configs/Configuration.properties";

		FileInputStream fileInput = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fileInput);//comes from FileInputStream
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		
		
		
		
	}

}
