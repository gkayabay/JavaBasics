package com.syntax.class23;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver { //3 dif classes i overridding method
	public void open() {
		System.out.println("Opening frefox browser");
	}
}

class ChromeDriver extends WebDriver {
	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorer extends WebDriver {
	public void open() {
		System.out.println("Opening internetexplorer browser");
	}
}
	
	
	


