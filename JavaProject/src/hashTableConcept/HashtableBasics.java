package hashTableConcept;

import java.util.Hashtable;

public class HashtableBasics {

	public static void main(String[] args) {

		Hashtable<String, Integer> marks = new Hashtable<>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
		marks.put("Robert", 600);
		marks.put("Ram", 700);
		marks.put("Rom", 605);
		marks.put("Rom1", 655);
		marks.put("Lisa1", 555);
		
		// Null key and Null values are n't allowed in Hashtable though allowed in HashMap
		
//	marks.put("Test", null); // It'll give you NullPointerException as the Object is pointing to null 0 value 
//	marks.put(null, 10); // NullPointerException - Cannot invoke "Object.hashCode()" because "key" is null
		
	System.out.println(marks.get("Sonali")); // Suppose you provide a random key which isn't added to Hashtable it'll give u Null value for it
		
System.out.println(marks.get("Naveen")); // Bring your debugger here chk for Key Naveen you'll get at 7th Index 
// hashcode 1968696341, open google and inspect goto Console on the top bar write the formula (Hashcode % 11)if you modulus hashcode with 11 (1968696341 % 11) this way you'll get 7th Index

// Why we're doing modulus with 11 ? Bcz the size of Hashtable is 11 it has 11 Nodes.

		System.out.println(marks.get("Peter"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
