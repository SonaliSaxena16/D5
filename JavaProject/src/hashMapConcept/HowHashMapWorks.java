package hashMapConcept;

import java.util.HashMap;

public class HowHashMapWorks {

	public static void main(String[] args) {

		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
		
		marks.put(null, 100000);
		
		// hashing : hashCode()-->hashing
		
		System.out.println(marks.get(null));
		
		System.out.println(marks.get("LISA"));

		System.out.println(marks.get("Lisa"));

		
		// pseudo code, how it'll bring the value - Explanation of above program how it retrieved the value from Lisa.
		// hashCode of Lisa is 210678
		// index = 15
		// now it'll use .equals() internally to look for matching Key(Lisa) & HashCode(210678)
		// If found both matching, then only it'll print the Value as 300
		
		
	}

}
