package com.syntax.class15;
 
public class CalculatorTest {

	public static void main(String[] args) {
	     
		Calculator calc = new Calculator();
		calc.add(100,200); //parameters icindeki degerler yani has to match int int yada double double vs olmali
		calc.sub(1000,300); 
		//calc.add(200); CE
		//calc.add(100.99, 200.99); CE
		
		calc.add(10000,200);
		calc.sub(10,3); 
		calc.mult(20,10);
		calc.div(20,10);
	}

}
