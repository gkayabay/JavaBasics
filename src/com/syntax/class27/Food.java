package com.syntax.class27;

public abstract class Food {
	//HW2.create food class that will have 3 undefined methods and 
	//it will have 4 subclasses; create a collection of food and 
	//using 3 ways execute methods

	public abstract void taste();
	
	public abstract void foodType();
	
	public abstract void rich ();
	
	
}	
	class Pizza extends Food {

		@Override
		public void taste() {
			System.out.println("Pizza tastes like pide which is a Turkish pizza.");
			
		}

		@Override
		public void foodType() {
			System.out.println("Pizza can be a gluten or gluten-free food. ");
			
		}

		@Override
		public void rich() {
			System.out.println("Pizza is a very rich food with lots of indigridients such as cheese, tomatoes etc.");
			
		}
	}
	
	class Fish extends Food {

		@Override
		public void taste() {
			System.out.println("Fish can be tender and serve as a hot food.");
			
		}

		@Override
		public void foodType() {
			System.out.println("Fish is a nonvegeterian food.");
			
		}

		@Override
		public void rich() {
		    System.out.println("Fish is can be rich or light food with few indigridents.");
			
		}
	}
	
	class Soup extends Food {

		@Override
		public void taste() {
			System.out.println("Soup can be soury, sweet and salty. It can be serve as hot and cold.");
			
		}

		@Override
		public void foodType() {
			System.out.println("Soup can be vegeterian, nonvegeterian and gluten/glutenfree.");
			
		}

		@Override
		public void rich() {
			System.out.println("Soup can be rich with some vegetables, meat, cheese etc.");
			
		}
	}
	class Desert extends Food {

		@Override
		public void taste() {
			System.out.println("Some deserts can be crunchy, sweet, soury or juicey");
			
		}

		@Override
		public void foodType() {
			System.out.println("Desert can be dairy/nondairy and gluten/glutenfree");
			
		}

		@Override
		public void rich() {
			System.out.println("Asure is a very rich food with lots of nuts, pomegranate etc.");
			
		}
	
	}
	

