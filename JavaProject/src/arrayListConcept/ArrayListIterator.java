package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		//How to Iterate to the Values in an ArrayList
		
		ArrayList<String> st = new ArrayList<String>(); // String type generic defined
		st.add("Sonali");
		st.add("Saxena");
		st.add("Hello");
		st.add("Java");
		
		// 1 Iterate using Typical for Loop
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
		
		System.out.println("-------------------");

		// 2 Iterate using Typical for each loop
		for (String s : st) {
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		
		//3 Stream Class with Lambda Function available in Java after JDK - 8
		st.stream().forEach(ele -> System.out.println(ele));
	
	

		System.out.println("-------------------");

	// 4 Using Iterator
	
	 Iterator<String> itr = st.iterator();
	 	while(itr.hasNext()) {
	 		System.out.println(itr.next());
	 	}
	
	 	System.out.println("------------------- ITERATOR");

	}
	
}
