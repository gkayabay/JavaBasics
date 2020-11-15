package com.syntax.class32;

import java.io.FileInputStream;
import java.util.*;


public class AmazonHw {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
	
		String filePath = System.getProperty("user.dir")+ "/configs/Amazon.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		    driver =  new ChromeDriver();
		    break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("customerName")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.name("password").sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("passwordCheck").sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
	
	}

}
