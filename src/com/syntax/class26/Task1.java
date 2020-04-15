package com.syntax.class26;

	interface Shapes {
 
		void calculateArea(double x);

		void calculatePerimeter(double x);
	}
	class Circles implements Shapes {
		@Override
		public void calculateArea(double x) {
			System.out.println("The area of the given circle is " + (3.14 * x * x));
		}

		@Override
		public void calculatePerimeter(double x) {
			System.out.println("The perimeter of the given circle is " + (2 * 3.14 * x));
		}
	}

	class Squares implements Shapes {
		public void calculateArea(double x) {
			System.out.println("The area of the given square is" + (x * x));
		}

		public void calculatePerimeter(double x) {
			System.out.println("The perimeter of the given square is " + (4 * x));
		}
	}

	public class Task1 {
		/*
		 * Create an Interface 'Shape' with undefined methods as calculateArea and
		 * calculatePerimiter. Create 2 classes Circle & Square that implements
		 * functionality defined in the Shape Interface. Test your code.
		 */

		public static void main(String[] args) {

			Shapes circle=new Circles();
			circle.calculateArea(10);
			circle.calculatePerimeter(20);
			
			Shapes square=new Squares();
			square.calculateArea(10);
			square.calculatePerimeter(20);
		}
	}


