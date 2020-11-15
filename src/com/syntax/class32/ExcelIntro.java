package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
	
		String filePath = "/Users/gulbahar/Documents/Test.xlsx"; //to bring the data into fileinputstream
		
		FileInputStream fis = new FileInputStream(filePath);//to bring the data into fileinputstream
         
		//accessing workbook
		Workbook wbook = new XSSFWorkbook(fis); //each workbook has sheets
		
		//accessing sheet
		Sheet sheet = wbook.getSheet("Sheet1"); //to acccess sheet and you get the object of Sheet Type
		//accessing row 
		Row row1 = sheet.getRow(0);
		
		//accesing cell
		Cell cell = row1.getCell(1);
	
		//get value from cell
		String r1cell2 = cell.toString();
		System.out.println(r1cell2); //lastName
		
		//how to access to get New York
		Row row3 = sheet.getRow(2);
		Cell  r3c3  = row3.getCell(2);
		String cellValue = r3c3.toString();
		System.out.println(cellValue);
		
		
		//access VA
		cellValue = sheet.getRow(1).getCell(3).toString(); //1st row 3. cell and convert to String
		System.out.println(cellValue);
		
		//to retrieve values based on type 
		double cellv = sheet.getRow(1).getCell(4).getNumericCellValue();//it gives numeric value as a double value
		System.out.println((int)cellv);//to convert value to int
		
		System.out.println("-------------");
		
		//how to get 20151 in a String format
		String valC = sheet.getRow(1).getCell(4).toString(); //retuns as a String 
		System.out.println(valC);
		String [] arr = valC.split("\\."); //to convert valC to String (to convert 1 value to another value)
		System.out.println(arr[0]);
		
		
		
		
	}

}
