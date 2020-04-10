package com.syntax.class24;

public class FileTest {
 
	public static void main(String[] args) {
		
	File [] files= {new JavaFile(), new WordFile(), new PDF()};
		
	    for(File f:files) {
	    	
	    	f.open();
	    	f.close();
	    	f.edit();
	 
	}

	}
}
