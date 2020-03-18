package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		
		//create 2D array in which we store professions
		
		String[][]professions= {
				{"QA Tester","Developers","Product Owner","Scrum Master"},
				{"Math Teacher", "Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}
		        };
		
		//get values using advanced for loop 
		for(String[] occupation:professions) { //Buyuk array de 3 tane array var onu loop yapar
			for(String title:occupation) {//ic array de her bir row daki elements leri loop yapar
				System.out.println(title);
			}
		
		System.out.println();
		
		
		}

	}

}
