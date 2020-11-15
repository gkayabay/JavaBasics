package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest2 {

	public static void main(String[] args) throws IOException {
		  String filePath = "/Users/gulbahar/Documents/Test2.xlsx"; //to bring the data into fileinputstream
			
			FileInputStream fis = new FileInputStream(filePath);//to bring the data into fileinputstream
	         
			//get an Object of Workbook type
			Workbook book = new XSSFWorkbook(fis); //Workbook is interface so we create obj from XSSFWorkbook class
			Sheet sheet = book.getSheet("Sheet2");
			
			int rows = sheet.getPhysicalNumberOfRows();//rows number
			
			int cols= sheet.getRow(0).getLastCellNum();//cols number
			
			//get data from all rows and all coloumns
			for(int r=0; r<rows; r++) {
				for(int c=0; c<cols; c++) {
			String	cellVal = sheet.getRow(r).getCell(c).toString();
			System.out.print(cellVal+" ");	
				}
				System.out.println();
				
			}
		
	}

}
