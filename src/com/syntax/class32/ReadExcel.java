package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
        String filePath = "/Users/gulbahar/Documents/Test.xlsx"; //to bring the data into fileinputstream
		String filePath1 = System.getProperty("user.dir")+ "/testdata/Test2.xlsx"; //dynamic way -->this will give me the entire path
        
        
		FileInputStream fis = new FileInputStream(filePath);//to bring the data into fileinputstream
         
		//get an Object of Workbook type
		Workbook book = new XSSFWorkbook(fis); //Workbook is interface so we create obj from XSSFWorkbook class
		Sheet sheet = book.getSheet("Sheet1");
	
		//need to find numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		//find number of coloms
		int cols = sheet.getRow(0).getLastCellNum();
		
		//get data from all rows and all coloumns
		for(int r= 0; r<rows; r++ ) { //iterates over rows
			for(int c=0; c<cols; c++ ) {//iterates over coloumns
			String cellVal = sheet.getRow(r).getCell(c).toString();
			System.out.print(cellVal+" ");
			}
			System.out.println(); //to print row by row
			
		}
		
	}

}
