package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntrotoExcelSelfPractice {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "/Users/gulbahar/Documents/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//Accessing workbook
		Workbook work = new XSSFWorkbook();
		
		Sheet sheet = work.getSheet("Sheet1");
		Row row1 = sheet.getRow(0); //to get 1st row
		
		Cell cell = row1.getCell(1);
		
		//get value form cell
		String r1cell2 = cell.toString();
		
		
		

	}

}
