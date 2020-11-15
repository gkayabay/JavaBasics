package t.collection;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2,10,3,2,5,10,3));
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2,10,3,2,5,10,3));
		
		//1st way  Using A Set
		Set<Integer> set1 = new LinkedHashSet<Integer>(list1);
        list1.clear();
        list1.addAll(set1); 
		
        //2nd Way, Checking if I already saw the number before
        List<Integer> newList = new ArrayList<Integer>();
        
		for(Integer number : list2) {
		if (!newList.contains(number)) {
		  newList.add(number);
		} 
	}
	list2.clear();
	list2.addAll(newList);
     System.out.println(newList);
     
     //in Collections have removeDuplicates methodu bu da kullanilabilir remove yapmak icin 
     
     
     
     
     
     
}
}
