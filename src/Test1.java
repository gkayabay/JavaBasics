

	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	public class Test1 {
		/*
		 * * Given a List of Strings replace '&' with "and".
		 * For example:
		 * Tromeo & Juliet 
		 * Platoon Kate & Leopold 
		 * Poltergeist III 
		 * Harold and Kumar Go to White Castle 
		 * Clerks II
		 */
		// List is an ordered collection and one of the most used Collection type. 
		// It is an interface and has own classes
		// such as ArrayList, LinkedList, Vector, Stack. 
		// I also import the ArrayList, List, Iterator from the java.util.
		
		public static void main(String[] args) {
	    // I created a LinkedList(class of List interface) and stored each String in it by using add() method.  
			LinkedList<String> words = new LinkedList<>(); // List<String> words = new LinkedList<>(); (I can create like this too)
			words.add("Tromeo & Juliet");
			words.add("Platoon");
			words.add("Kate & Leopold");
			words.add("Poltergeist III");
			words.add("Harold and Kumar Go to White Castle");
			words.add("Clerks II");
			System.out.println("----------1st Way For loop- loop through each and replace & with and----");
	    // it will loop through each String in the List until the size of the List. 
			for (int i = 0; i < words.size(); i++) {  
	      // each one is called and replaced "&" with "and"
				String UpdatedWords = words.get(i).replace("&", "and"); 
	      //to print each String I used the System.out.println();
				System.out.println(UpdatedWords);
			}
			System.out.println("-----------2nd Way- Using Advanced Loop----------------------------------");
			// it will loop through each String 
			for (String Updatedword : words) { 
				//replaced with "&" with "and" then reassigned as a String and stored. 
				String replacedWord = Updatedword.replace("&", "and"); 
				//print each new String that is replaced.
				System.out.println(replacedWord);
			}
			
			
			System.out.println("-----------3rd Way Using Iterator----------------------------------------");
	    //Note: Iterator is an Interface and it will iterate through each element.
			// 3 methods are used in the Iterator interface such as;
			// hasNext()--> it returns true if the Iterator has more elements
			// next()--> it returns the element and move the cursor pointer to the next element
			// remove()--> it removes the last element returned by the Iterator, (I did not use this method here) 
			
			Iterator<String> it = words.iterator();
			while (it.hasNext()) {//as long as there is a next element. This will NOT move the cursor
				 String eachWord = it.next();//Get the next element. This will move to the next element.
				 String replaced = eachWord.replace("&", "and"); //repleace()--> method is used and stored as a String.
				 System.out.println(replaced); //print each String
			}
			System.out.println();
			
		}
	}





