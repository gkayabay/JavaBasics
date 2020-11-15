package com.review09;

public class WrapperDemo {

	public static void main(String[] args) {
	
		Integer integer1 = new Integer(10);//Boxing get the 10 and put it into integer container
		int int2 = integer1.intValue();//intValue()-->getting or taking the value from inside (UnBOxing)
		
		System.out.println(int2);
		
		int int3 = 10;
//	    Integer integer3 = new Integer(int3);
		Integer integer3 = int3;//AutoBoxing, AutoBoxing, Auto-converting
//		int int4 = integer3.intValue();
		int int4 = integer3; //Auto-Unboxing, Auto-Unwrapping, Auto-converting
		 
		double d1 = 3;
		Double d2 = d1;//Auto boxing 
        
		//it does not access it in one step
//		Double d3 = 3;
		Double d4 = 3.0;// Auto boxing
		
		
		double d5 = d4.doubleValue();//1st way , long way; unboxing
		double d6 = d4;//2nd way, short way; Auto-unboxing;
	    
		
		//Blooean is the chococlate with a wrapper
		Boolean b1 = new Boolean(true);
		//if we need the primitive value we un-box
		//boolean is the chocolate without the wrapper
		boolean b2 = b1.booleanValue();
	
	
	}

}
