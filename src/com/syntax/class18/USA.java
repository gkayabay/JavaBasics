package com.syntax.class18;

public class USA {

	//create a variable to hold state and capital of the state
	String state, stateCapital;
	
	//create method to display state and stateCapital
	
	public void display() {
		System.out.println(state+" and it`s capital is "+stateCapital);
	}
	
	//create a constructor that will initialize  instance varieble
	public USA (String state, String stateCapital) { //passsing parameters
		this.state = state;    //initialize instance variables this.state-->instance variable, state-->local variable 
		this.stateCapital= stateCapital;
	}
	
	
	public static void main(String[] args) {
		
		USA usa = new USA("Virginia", "Richmond");
		usa.display();
		
		 
	}
	
	
	
	
}
