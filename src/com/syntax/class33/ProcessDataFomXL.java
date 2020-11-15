package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFomXL {

	public static void main(String[] args) throws IOException {

		String file = System.getProperty("user.dir") +"/testdata/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");//null
		
		int rows =sheet.getPhysicalNumberOfRows();  //Number of rows 
		int cols = sheet.getRow(0).getLastCellNum(); //Number of cells
		
		List<Map<String,String>> xlData = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {  //we start from 1 becuase row 0 is header
			
			Map<String, String> map = new LinkedHashMap<>(); //create the map 
			
			//iterate over coloums
			for(int c=0; c<cols; c++) {
				String key  = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key,value);
			}
			xlData.add(map);
		}
		System.out.println(xlData);
		
		
		
		System.out.println("-------------accessing each map seperately--------------");
		
		for(Map<String,String> map: xlData) { //inside list we have a collection of map
			System.out.println(map);//take every map and store into list
		}
	}

}
