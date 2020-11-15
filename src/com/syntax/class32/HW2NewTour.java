package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.syntax.class25.WebDriver;

public class HW2NewTour {
	/*HW2. Using xl file that we created to new tour application 
	  (http://www.newtours.demoaut.com/) create a data driven test: 
       Register to an account using 3-4 different sets of data 
       (exclude passing values to the drop down and try to use different locators 
       that you know if possible)
	 */
	
	public static WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException {
	
		String filePath = System.getProperty("user.dir") + "testdate/Test2.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.getSheet("Sheet2");
	    int rows  = sheet.getPhysicalNumberOfRows();
	    int colls = sheet.getRow(0).getLastCellNum();
	    
	    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
	    
	    List<Map<String,String>> listMap = new ArrayList<>();
	    
	    for(int r=1; r<rows; r++) {
	    	Map<String,String> map =  new LinkedHashMap<>();
	    	driver.findElement(By.LinkText("Register")).click();
	    for(int c=0; c<colls; c++) {
	    String key = sheet.getRow(0).getCell(c).toString();
	    String value = sheet.getRow(r).getCell(c).toString(); 
	    map.put(key, value);
	    
	    switch(key) {
	    case "FirstName":
	    	driver.findElement(By.name("firstName")).sendKeys(map.get(key));
	    break;
	    
	    case "LastName":
	    	driver.findElement(By.name("lastName")).sendKeys(map.get(key));
	    break;
	    
	    case "Phone":
	    	driver.findElement(By.name("phone")).sendKeys(map.get(key));
	    break;
	    
	    case "Email":
	    	driver.findElement(By.is("userName")).sendKeys(map.get(key));
	    break;
	    case "Adress":
	    	driver.findElement(By.name("Adress1")).sendKeys(map.get(key));
	    break;
	    case "City":
	    	driver.findElement(By.name("city")).sendKeys(map.get(key));
	    break;
	    case "State":
	    	driver.findElement(By.name("state")).sendKeys(map.get(key));
	    break;
	    case "PostalCode":
	    	driver.findElement(By.name("postalCode")).sendKeys(map.get(key));
	    break;
	    case "UserName":
	    	driver.findElement(By.id("email")).sendKeys(map.get(key));
	    break;
	    case "Password":
	    	driver.findElement(By.name("password")).sendKeys(map.get(key));
	    break;
	    case "ConfirmPassword":
	    	driver.findElement(By.xpath("//input[@name= 'confirmPassword']")).sendKeys(map.get(key));
	    break;
	    
	    }
	    }
	    driver.findElement(By.name("register")).click(); //After first map register each user (Every Row is a map
	    listMap.add(map);
	    
	    
	    }
	}
}


