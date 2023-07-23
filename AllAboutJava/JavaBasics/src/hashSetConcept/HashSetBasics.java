package hashSetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Game");
	//	hs.add("Beta"); // Duplicates not allowed. It'll print only once
	//	hs.add(null);	// Null allowed

		System.out.println(hs);
	//	System.out.println(hs.contains("Testing"));
		
		for(String e : hs) {
			System.out.println(e);
		}
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		hs.remove("Beta");
		System.out.println(hs);

		Set<Integer> first = new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));		
		
		Set<Integer> second = new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,9}));		
		
		// get the union
		
		Set<Integer> union = new HashSet<>(first);
		union.addAll(second);
		System.out.println(union); // remove duplicates
		
		// get the intersection - means you'll get only common items
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection); // Don't know but not working
		
		// get the Differences
		
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff); // Don't know but not working
		
	}

}
