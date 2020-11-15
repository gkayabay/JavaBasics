package t.collection;

import java.util.*;

public class InitializeArray {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add(1, "d");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>() {  //declearing a list 
			add("e");
			add("f");
			add("g");
			
		};
		System.out.println(list2);
		
		
		//This is immutable, you cannot add/remove objects
		String [] arr = {"h", "i", "j"};
		
		List<String> list3 = Arrays.asList(arr);
		//This will give run-time error
		//list3.add("K")
		System.out.println(list3);
		
		
		//In this case, list4 is mutable/expenable
		
		List<String> list4 = new ArrayList<String> (Arrays.asList(arr));
		list4.add("k");
		System.out.println(list4);

		List<String> list5 = new LinkedList<String> (list4);
		System.out.println(list5);
		
		System.out.println("------------------Iterating a list-------------");
		//Itearting a List
		//1st way
		
		for(int i =0; i<list5.size(); i++) {
			String letter = list5.get(i);
			System.out.print(letter + ", ");
		}
		
		//2nd way
		for(String element : list5)
			System.out.println(letter +", ");
	}
	System.out.println();
	
	//3rd way
	Iterator<String> it = list5.iterator();  //list5 String type inda oldugu icin String yazdik

	while(it.hasNext()) {
		String letter = it.next();
		System.out.println(letter+ " ");
	}
	System.out.println();
	
	
	
		
		list5.get(1);
		
		
		
		
		
		
		
		
		
		

	}

}
