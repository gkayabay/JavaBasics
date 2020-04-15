package com.Review08.Abstraction2;

public class FruitDemo {
	
	public static void main(String[] args) {
		
		//Peelable p1 = new Apple("Yellow")//indirectly create Peelable
		
		Fruit f1 = new Apple("Red"); //I cannot create Fruit f1 =new Fruit() bec Fruit is abstarct
		f1.eat();
//	    f1.peel();
		
		Apple a1 = (Apple) f1;//to peel and wash i have to convert first
		a1.peel();
		a1.wash();
		
		System.out.println();
		Orange o1= new Orange("Orange");
		o1.peel();
		o1.eat();
		
	}

}
