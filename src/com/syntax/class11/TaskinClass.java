package com.syntax.class11;

public class TaskinClass {

	public static void main(String[] args) {
		
		String[][] car= {
				{"Ford","Chevy","Lincoln"},
				{"BMW","Mercedes","Wolsvagen"},
				{"Kia","Hundai"},
				{"Fiat"}		
		        }; 
   //for loop ile
		int total=0;
		for(int i=0; i<car.length; i++) {
			for(int j=0; j<car[i].length; j++) {
				System.out.println(car[i][j]+" ");
				total++;
			}
			System.out.println();
		}
		//using advanced loop
		int count=0;
		for(String [] cars:car) {
			for(String carnames:cars) {
				System.out.println(carnames+" ");
				count++;
			}
		System.out.println();
		}
	


//create an array of countries:NA countries, SouthAmerica, Europe, Asian, African
         String [][] countries= {
        		 {"Canada", "Cuba","Costa Rica","Dominica"},
        		 {"Brazil","Argentina","Peru","Colombia"},
        		 {"Italy","Germany","France","Greece"},
        		 {"Nigeria","Kenya","Ghana"},
        		 {"Japan","Singapore","China"}
                 };
         
         
         //Using Regular For LOOp
         int total1=0;
         for(int i=0; i<countries.length; i++) {
        	 for(int j=0; j<countries[i].length; j++) {
        		 System.out.println(countries[i][j]+" ");
        		 total1++; //yukarda initializze yap total i burda da loop cuntry her dondugunde count yap
        	 }
        	 System.out.println();
         }
        
         
         //using Advanced FOR Loop
         int counts=0;
         for(String[]country:countries) {
        	 for(String countryName:country) {
        		 System.out.print(countryName +" ");
        		 counts++;
        	 }
        	 System.out.println();
         
         }
        System.out.println(countries.length);
         }
}








