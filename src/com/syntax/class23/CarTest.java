package com.syntax.class23;

public class CarTest {
	
	public static void main(String[] args) {
		
	Car bmw=new BMW ("BMW");//upcasting creating object. I want to be type of parent class Car
	bmw.display();//from Car parent class
	bmw.start(); //from sublclass form BMW class
	//bmw.navigatte();CE; Undefined method because Car class inda bu method yok
	Car tesla=new Tesla ("Tesla");//every car is a tesla and Tesla is store in tesla variable
	Car merc= new Mercedes("Mercedes");
	Car honda=new Honda("Honda");
		
	
	//{bmw,tesla,merc,honda} //collect all objects and store in one variable
	
	Car [] cars ={new BMW("BMW"),new Tesla ("Tesla"),new Mercedes("Mercedes"),new Honda("Honda")};
		//store all these objects inside Car []) //All BMW, Tesla etc objects of Car Type
		
	
	for(Car c:cars) {   //types of element is  Car:array name and stored/assign into "c"
	   c.start();                  //c is reference variable 
	   c.display();
	   
	   System.out.println("-----------------------------------");
	}
	
	System.out.println("------------------------------------");
	   for (int i=0; i<cars.length; i++) {
		   cars[i].start(); //ornek bmw.start(); hre bir obj icin method print yap
		   cars[i].display();//loop taki car[0], car[1] vs herbir obj icin start ve display methodunu print yapiyor  
	   }
	   
	   
	}
}
