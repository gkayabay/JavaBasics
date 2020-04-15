package com.syntax.class26;

public class WebDriverTest {

	public static void main(String[] args) {

	  RemoteWebDriver [] driver = {new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
		
	  for(RemoteWebDriver dr :driver) {
		  dr.close();
		  dr.open();
		  dr.navigate();
		  dr.getTitle();
		TakesScreenshot ts = new FirefoxDriver();//only FirefoxDriver gets Screenshot.
		 ts.getScreenShot();
		System.out.println("-----------------------------------------------------------");
	  }

	}

}
 