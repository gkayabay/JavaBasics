package com.syntax.class25;

interface CreditUnion {

	void giveCredit();
}

class Finance {
	
	public void financing() {
		System.out.println("Dealing with financing");
	}
}

	public interface Trustable { // parent interface
		// by default compiler will make method to be public and abstract
		void trust();// provide behavior
	}

	interface Bank extends Trustable {// Child interface //Bank is interface that is in abstract
		// by default compiler will make method to be public and abstract
		void deposit(); // abstract method
		// by default compiler will make method to be public and abstract
		void withdraw(); // abstract method
	}

	class BOA extends Finance implements Bank, CreditUnion {// if you BOA wants to be Bank provide me the implemnetation
//BOA is a type of Bank and interfaces with Bank and Credit union
		@Override // BOA has multiple parents
		public void trust() {
			System.out.println("BOA is trustable");

		}

		@Override
		public void deposit() {
			System.out.println("You can make a deposit at BOA");

		}

		@Override
		public void withdraw() {
			System.out.println("You can withdraw money at BOA");

		}

		@Override
		public void giveCredit() {
			System.out.println("BOA gives credit");

		}
	}


