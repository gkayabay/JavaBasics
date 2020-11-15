package com.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
	
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
        String filePath = projectPath+ "/extra/demo.properties";
		
        FileInputStream fileIS = new FileInputStream(filePath);//FileInputStream is the child of InPutStream
        
        Properties proper =  new Properties();//get the Properties class to use the methods that it has
        
        proper.load(fileIS);  //read it into memory and load the fileIS
        
        System.out.println(proper);
        
        //1st way; Get as Object and Downcasting into a string
  //    String lastname=  (String) proper.get("LastName");//downcasting from Object to String(Bu sekilde de olur)
        
        String lastname = proper.getProperty("LastName");//you will get a key as a string with getProperty
        System.out.println("LastName --->"+lastname);
        
        //2nd way, Get the value as a String 
        String firstname = proper.getProperty("FirstName");
        System.out.println("FistName--->"+firstname);
        
        String school = proper.getProperty("School|Syntax");
        System.out.println("School|Syntax--->"+school); //gives null because there is no "School" in the demo.properties files
        
        //1st way. Use getProperty to get as a String
        String age1 = proper.getProperty("Age");
        System.out.println("age1 "+age1);
        
        //2nd way. Use get method to get age as an Object
        String age2 = (String) proper.get("Age"); //casting as a String 
        System.out.println("age2 "+ age2);
        
        //Add more key--->value pairs
        proper.setProperty("StudentNumber", "123"); //writing here
        System.out.println(proper);
        
        //or we can reassign
        proper.setProperty("FirstName", "Omar");
        
        System.out.println(proper);
        
        proper.setProperty("HI", "There");
        
       
        
        //Lets write back into the properties file
        
        FileOutputStream fileOS = new  FileOutputStream(filePath);
        proper.store(fileOS, "Hi there");//prevous ones deleted. fileOS dosyasina "Hi There " yaz.it saves back into the proper
        
        
        
        
        
        
      

	}

}
