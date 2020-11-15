package com.syntax.class28;


abstract class Coverage {
	public void method() {
		System.out.println("Method of coverage class");
	}
}

public abstract class Insurance {

	//HW1.Create a class Insurance that will have an attribute as insuranceName 
	//and unimplemented behaviour as getQuote and cancelInsurance. 
	//Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    //Create 3 objects of the sub classes and store them in ArrayList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class. 

	String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
	
	
}
	class Car extends Insurance{
    
	String carModel;
		
	public Car(String insuranceName, String carModel) {
			super(insuranceName);
			this.carModel = carModel;	
		}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+ "insurance provides 10% discount for "+carModel+" customers ");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel car insurance within the 60 days in "+insuranceName);
		
	}	
	}
	class Pet extends Insurance {
		
		String petType;
		
		public Pet(String insuranceName, String petType) {
			super(insuranceName);
			this.petType = petType;
		}

		@Override
		public void getQuote() {
			System.out.println(insuranceName+ " is the cheapest pet insurance for "+petType+" compare to others " );
			
		}

		@Override
		public void cancelInsurance() {
			System.out.println("You may cancel your "+petType+ " insurance with "+insuranceName+" either by phone, email etc.");
			
		}
	}
	class Health extends Insurance {

		public Health(String insuranceName) {
			super(insuranceName);
			
		}

		@Override
		public void getQuote() {
			System.out.println(insuranceName+" has better plan options for families compare to other health insurance companies" );
			
		}

		@Override
		public void cancelInsurance() {
			System.out.println(insuranceName+ "cancel your health insurance within 30 days.");
			
		}
		
	}
	
