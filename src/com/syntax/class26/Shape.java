package com.syntax.class26;
//TASK 1 HW
public interface Shape {

	void calculateArea();
	void calculatePerimeter();
}
 class Square implements Shape {
	int a;
	Square(int a) {
		this.a = a;
	}
	
	@Override
	public void calculateArea() {
		int aSquare = a*a; 
		System.out.println("Area of square is "+aSquare);
	}

	@Override
	public void calculatePerimeter() {
		int periSquare= 4*a	;
		System.out.println("Perimeter of Square is "+periSquare);
	}
 }
 class Circle implements Shape {
     int r;
     double pi=3.14;
	 
	 Circle(int r, double pi) {
		 this.r = r;
		 this.pi=pi;
	 }
	 
	@Override
	public void calculateArea() {
		double aCircle = pi*r*r;
		System.out.println("Area of circle is "+ aCircle);
	}

	@Override
	public void calculatePerimeter() {
        double periCircle = 2*pi*r;
		System.out.println("Perimeter of a circle is "+ 2*pi*r);
	}
		
}
