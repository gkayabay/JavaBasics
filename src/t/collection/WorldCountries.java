package t.collection;

import java.util.*;

public class WorldCountries {

	public static void main(String[] args) {
	
		List<String> europe = new ArrayList<>();
		europe.add("France");
		europe.add("Italy");
		europe.add("England");
		
		List<String> africa = new ArrayList<>();
		africa.add("Tunusia");
		africa.add("Algeria");
		africa.add("Senegal");
		
		List<String> northAmerica = new ArrayList<>();
		northAmerica.add("US");
		northAmerica.add("Mexico");
		northAmerica.add("Canada");
		
		List<List<String>> world = new ArrayList<List<String>>();
		
		world.add(europe);
		world.add(africa);
		world.add(northAmerica);
		
		System.out.println(world); //print list of list
		
		System.out.println("--------Using Enchanced For Loop-------------");
		for(List<String> continent: world) {  //continent is a List
			//System.out.println(continent);
			for(String country : continent) {
				System.out.print(country + "<>");
			}
			System.out.println();
		}
		
		System.out.println("Using Iterator");
		Iterator<List<String>> it = world.iterator();
		while(it.hasNext()) {
			List<String> continent =  it.next();
			Iterator<String> innerIterator = continent.iterator();
			while(innerIterator.hasNext()) {
				String country = innerIterator.next();
				System.out.print(country +" <> ");
			}
			System.out.println();
		}

	}

}
