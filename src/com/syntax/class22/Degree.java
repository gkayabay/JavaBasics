package com.syntax.class22;

public class Degree {
	
	//Task1- Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To get a degree you need high school diploma”“. 
	//Class ‘Degree’ has 2 subclasses namely ‘Bachelors’ and Masters’. In Masters class override method ‘getPrerequisite’.
	//Call the method by creating an object of each of the three classes.
	public void getPrerequisite () {
		System.out.println("To get a degree you need high school diploma");
	}

}
	
	class Bachelor extends Degree {
		public void getPrerequisite () {
			System.out.println("To get a Bachelor degree you need to get score 90 and above");
		}

    }
	
    class Master extends Degree {
    	
    public void getPrerequisite () {
    		System.out.println("To get a Master degree you need bachelor diploma first");
    }	
    }
