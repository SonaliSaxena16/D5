package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {

// 1 Sort and then equals
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("F","A","C","B","D"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(l1);
		System.out.println(l1);

		Collections.sort(l2);
		System.out.println(l1.equals(l2)); // It'll give False
		System.out.println(l1.equals(l3)); // It'll give True
		
// 2 find out the Unique/Additional ele
//Compare two list and find ele from 1st list which are SIMILAR in 2nd list. Now it'll remove all same ele from 1st & leave only Unique ele in the 1st list
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
//		l4.removeAll(l5);
//		System.out.println(l4); // It'll print F
		
		
		l5.removeAll(l4);
		System.out.println(l5); // It'll print E
				
	//4 find out the common ele in 2 arrayList
		
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","JS"));

		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
