package t.collection;

import java.util.*;

public class SetIntro {

	public static void main(String[] args) {
		
		Set<String> africa1 = new LinkedHashSet();
 
		africa1.add("Tunusia");
		africa1.add("Algeria");
		africa1.add("Senegal");
		
		//africa1.add(1, "Kenya"); //this will give compile error because SET Does NOt have Index
		
		boolean addedInSet = africa1.add("Kenya");
		System.out.println("Algeria was added into the set:" +addedInSet);
		
		
		System.out.println(africa1);
		
		//africa 1 is added inside africa2 
		Set<String> africa2 = new HashSet<String>(africa1);
		System.out.println("africa --> "+ africa2);
		
		Set<String> africa3= new TreeSet<String>(africa1);
		System.out.println("africa3 --> "+africa3);
		
		int size  = africa3.size();
		boolean contains = africa2.contains("Kenya");
		boolean ableToRemove = africa2.remove("Algeria");
		System.out.println("ableToRemove -->" + ableToRemove);
		System.out.println(africa2);
		
		
		Set<String> africa4 = new HashSet<>();
		africa4.isEmpty(); // check if africa4is Empty
		
		
		
		
		
		
		
	}

}
