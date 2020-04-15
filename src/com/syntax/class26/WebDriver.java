package com.syntax.class26;

public interface WebDriver {
	//TASK-4 (GROUPWORK)
    String getTitle();
	void open();
    void close();
}
interface TakesScreenshot extends RemoteWebDriver {
	void getScreenShot();
}
interface RemoteWebDriver extends WebDriver {
	void navigate();	
}
 class ChromeDriver implements RemoteWebDriver, WebDriver {
	 
	 @Override
		public String getTitle() {
			String getTitle= "ChromeDriver";
			return getTitle;
	}
	 @Override
	public void open() {
		System.out.println( this.getTitle()+" opens easily.");	
	}
	@Override
	public void close() {
		System.out.println(this.getTitle()+" close easily and fast");	
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+" navigates smoothly.");
	}
	
	}
class FirefoxDriver implements RemoteWebDriver, TakesScreenshot {
 
	@Override
	public String getTitle() {
		String getTitle = "FirefoxDriver";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println(this.getTitle()+" opens quickly.");	
	}
	@Override
	public void close() {
		System.out.println(this.getTitle()+" close quickly.");	
	}
	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+" gets lots of screenshots.");	
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+" navigates easily.");	
	} 
 }
class SafariDriver implements RemoteWebDriver, WebDriver {

	@Override
	public String getTitle() {
		String getTitle= "SafariDriver";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println(this.getTitle()+" opens super quickly.");	
	}
	@Override
	public void close() {
		System.out.println(this.getTitle()+" closes quickly too.");	
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+" closes quickly too.");
		
	}
}