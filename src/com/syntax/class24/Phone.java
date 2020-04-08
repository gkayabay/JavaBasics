package com.syntax.class24;

public abstract class Phone {
	//implemented methods
	public void call() {
		System.out.println("Phone can make a call");
	}

	public void text() {
		System.out.println("Phone can send text");
	}
	//unimplemeted methods= undefined methods=abstract methods
	public abstract void takePictures(); //undefined or abstract method
	public abstract void playMusic();
	
}
class Iphone extends Phone {

	@Override
	public void takePictures() {
		System.out.println("Iphone takes pictures");
		
	}

	@Override
	public void playMusic() { //providing implementation details yapilir 
		System.out.println("Iphone plays music using Apple store");
	}
}

class Samsung extends Phone {

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music using Apple store");
	}
}
	
