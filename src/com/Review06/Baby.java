package com.Review06;

public class Baby {
	
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	public void walk() {
		System.out.println("Crawling....");
	}
	public String cry () {
		System.out.println("Cry every minute....");
		
		return "Cry every minute.....";
	}
	public void talk(int times) {
		for(int i=1; i<=times; i++)
		System.out.println("Bla ");
	}

    public void displayBabyINfo() {
    	System.out.println("Full name of baby is "+firstName+" "+lastName);//ayni class icinde only variable name yaz baska class ta print istersen baby1.firstName yaz
    	System.out.println("Gender is  "+gender);
    	if(gender == 'F') {
    		System.out.println("Girl");
    	}else if (gender =='M') {
    		System.out.println("Boy");
    	}else {
    		System.out.println("unknown");
    	}
    	System.out.println("Hair color is "+ hairColor);
    }
	 
 }
