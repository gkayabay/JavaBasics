package com.syntax.class31;

//shortcut for import command+shift+o
import java.io.FileInputStream; //io= java input and output
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		//to read the files:
		//have file
		String filePath ="/Users/gulbahar/eclipse-workspace/JavaBasics/configs/Examples.properties";
				//i need to specify the file location//
		
		//2.bring object of FileInputStream
		
		FileInputStream fileInput = new FileInputStream(filePath);	//data "filePath" flow into FileInputStream
		
		//to handle data from .properties file we need Property Class
		
		Properties prop = new Properties();//create object of Properties class//Different methods are avaliable inside Properties class
		prop.load(fileInput); //we load fileInput inside the prop object
		
		String name =prop.getProperty("name");//is going to return me a form of string
		System.out.println(name);
		
		String city= prop.getProperty("city");//from that property I want to extract city in a String form
		System.out.println(city);
		
		
		//getting all keys from property file  //properties class is a type of Hashtable
		Set<Object> keys = prop.keySet(); //to get keys
		for(Object key:keys) {
			System.out.println(key);
		}
		  

	}

}
