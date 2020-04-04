package com.gulbahar.practices;

public class ShoppingStore {

	String item;
	double price;
	int quantity;
    
	
	public ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public double itemTotalPrice() {
		double totalprice = (price * quantity);
		System.out.println(item + " Total Value " + price);
		System.out.println("You purchased " + totalprice + " Today");
	    
	    return totalprice;

	}

	public static void main(String[] args) {

		ShoppingStore obj1 = new ShoppingStore("Blanket", 99.98, 1);

		ShoppingStore obj2 = new ShoppingStore("Matress", 439.18, 1);
		
		
		System.out.println();
		obj1.itemTotalPrice();
		obj2.itemTotalPrice();
	}
}

