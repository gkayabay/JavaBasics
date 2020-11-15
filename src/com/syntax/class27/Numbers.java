package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {
	// HW4. Create an arrayList of even numbers from 1 to 50.
	// Using Iterator remove any number that is divisible by 5 from that arrayList.
	public static void main(String[] args) {

		ArrayList<Integer> evenNums = new ArrayList<>();
		for (int i = 0; i <= 50; i += 2) {
			evenNums.add(i);
		}
		System.out.println(evenNums);

		Iterator<Integer> it = evenNums.iterator();// we get the object of Iterator type everytime when collection gets
													// iterator() method
		while (it.hasNext()) {
			                                //Integer even = it.next(); boyle de yazilabilir
			if (it.next() % 5 == 0) {
				it.remove();//any object if you want to remove from collection use iterator (safer method oldugu icin)
			}
		}
		System.out.println(evenNums);
	}
}
