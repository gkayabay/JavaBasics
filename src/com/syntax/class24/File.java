package com.syntax.class24;

public abstract class File {
    //Task1 - Create a class File that will have the following behaviors: 
	//open, edit, close. Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
	//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

	public abstract void open (); 
	
	public void edit() {
		System.out.println(" File can be edited ");
	}
	
	public void close() {
		System.out.println("Files can be closed ");
	}
}
class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("Java file needs notepad++ or sublime text to open");
		
	}
	
}
class WordFile extends File {

	@Override
	public void open() {
		System.out.println(" to open .doc file we need Microsoft Word");
		
	}
}
class PDF extends File {

	@Override
	public void open() {
	System.out.println("to open .pdf file we need Adobe reader");
	}
}
