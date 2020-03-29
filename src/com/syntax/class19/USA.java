package com.syntax.class19;

public class USA {
	
		String state, stateCapital;
		
		public USA(String state, String stateCapital) {//local variables 
			this.state = state;       //"this'--->to differentiate between instance variable and local variable 
			this.stateCapital = stateCapital;//using this trying to access instance variable
		}
		
		public void displayState() {
			System.out.println(state);
		}
		public void displayStateCapital() {
			System.out.println(stateCapital);
		}
		
		//can I call a method inside another method?-->YES
		public void displayInfo() {  //calling method inside another method
			displayState();
			displayStateCapital();
			
		}
		
		
		public static void main(String[] args) {
			
	    USA state1 = new USA("Texas","Austin");
	    
	    System.out.println(state1.state);
	     
	   // USA();we can not call the constructor method like this
	    state1.displayState();
	    state1.displayStateCapital();
	
		}

}
