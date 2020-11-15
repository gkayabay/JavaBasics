package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
	    //user.dir --> gives me the entire path upto javabasics
		String filePath = System.getProperty("user.dir")+ "/testdata/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath); //now data is inside my FileInputStream
		
		Workbook book = new XSSFWorkbook(fis);
		
		//writting into existing sheet 
		Sheet sheet1 = book.getSheet("Sheet1");//grab the sheet
		
		sheet1.getRow(0).createCell(5).setCellValue("Country");//get row then create cell and value
		
		sheet1.getRow(0).createCell(6).setCellValue("Language");//create cell and write value inside cell
		
		sheet1.createRow(3).createCell(0).setCellValue("Hichem");//created cell first then, write value inside a cell
		
		sheet1.createRow(3).createCell(1).setCellValue("Sandy");
		
		
		Sheet customSheet= book.createSheet("TestSheet"); //to create sheet 
		
		FileOutputStream fos = new FileOutputStream(filePath);
		
		book.write(fos);//write fos 
		
		

	}

}
