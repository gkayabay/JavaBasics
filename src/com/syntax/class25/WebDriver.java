package com.syntax.class25;

interface TakesScreenshot{
	
	String fileextension= " .png"; //this is static varaible by default and it shows in italic
	
	void takePicture();
	
	//features below were added from Java 1.8 version
	static void takeSelfie() {
		System.out.println("I can take a selfie");//without effecting childs you can add static method
	}
	default void takePanoramaPic() {
		System.out.println("I can take panoramic pictures");
	}
}

public interface WebDriver {
	
	 void openBrowser();
	 
	 void closeBrowser();
	
	 void maximizeWindow();
	 
	 void findElement();

}
class ChromeDriver implements WebDriver, TakesScreenshot {

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver opens so fast");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver close so fast");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome driver maximizes window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome Driver finds elements");
		
	}

	@Override
	public void takePicture() {
		System.out.println("In chrome we can take pictures");
		
	}
}
