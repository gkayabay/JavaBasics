package com.syntax.class23;

public class WebDriver {

	public void open() { //Overridden happens in parent class
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver { // 3 different classes in overriding method
	
	public void open() { //overriding happens in child class
		System.out.println("Opening frefox browser");
	}
}

class ChromeDriver extends WebDriver {
	
	public void open() { //overriding
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorer extends WebDriver {
	
	public void open() { //overriding
		System.out.println("Opening internetexplorer browser");
	}
}
