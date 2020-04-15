package com.syntax.class26;

public class CarTest {

	public static void main(String[] args) {
	  
		Car c = new Sedan(20000, "Blue", 160);
		c.calculateSalePrice();
		System.out.println(c.calculateSalePrice());
         
		Car tk = new Truck(15000, "Green", 1578.6);
		double carPrice= tk.calculateSalePrice();
		System.out.println(tk.calculateSalePrice());
		
	}

}
