package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		 //user.dir --> gives me the entire path upto javabasics
		String filePath = System.getProperty("user.dir")+ "/testdata/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath); 
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		//writting into existing sheet 
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>> listMap = new ArrayList<>(); //create empty collection. then add my maps. Every row will be my individual map
		                                                     //so we need to loop through each rows and colloums
		for(int r=1; r<rows; r++) { //itearte over the coloums (every row will be our map)
			
			Map<String, String> map = new LinkedHashMap<>();//everyrow we create LinkedHashMap (to keep the order)
			
			for(int c=0; c<cols; c++) {//iterate cols (every cols will be stored inside map)
				
			String key = sheet.getRow(0).getCell(c).toString(); //key comes from 1st row,  value comes from 2nd row
			String value = sheet.getRow(r).getCell(c).toString();
			map.put(key, value);
				
			}
			listMap.add(map);//the map that we created will be added into listMap
		}
		System.out.println(listMap);
		
		

	}

}
