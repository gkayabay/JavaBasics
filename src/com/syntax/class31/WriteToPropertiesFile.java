package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		//if we dont load it data will not be in the file 
		
		//write into existing file and add values
		String filePath ="/Users/gulbahar/eclipse-workspace/JavaBasics/configs/Examples.properties";
         
		//make object of the FileInputStream or passing our stream or making connection
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties(); //create obj of Properties 
		prop.load(fis);//load the file  //Load the data that comes from FileInputStream. we load only once. 
		
		prop.setProperty("phoneNumber", "123457649"); //added more data. Methods here accepts only String
		
		//create obj of the fileOutputstream to write
		FileOutputStream fos = new FileOutputStream(filePath);//push back the data by FileOutPutStream
		prop.store(fos, "Added additional key");
	}      //("file from FileOutPutStream",comment)

}
