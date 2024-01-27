package hashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DifferentWaysToCreateHashMap {
	
	// 3rd way to use Static Block
static {
		
		HashMap<String,Integer> marksMap = new HashMap<>();
		marksMap.put("A", 90);
		
		// OR
		
		Map<String,Integer> map1 = new HashMap<>();
		map1.put("B", 80);
	}
	
	
	
	public static void main(String[] args) {

	// 1 way to directly create Object Of HashMap
	HashMap<String,Integer> hs1 = new HashMap<>();
	hs1.put("S", 70);

	// 2nd way by Upcasting using Map Interface and calling child class HashMap reference
	Map<String,Integer> m = new HashMap<>();
	m.put("j", 60);
	
	System.out.println(hs1.get("S"));
	
	
	// 3rd Do we create Immutable Map ? Yes singleton map can be created but with single entry only
	// For that use Collections class and its one of the method.
	
	Collections.singletonMap("Test", 1111); // Now upcast it to Map Interface in next line then comment this line
	
	Map<String, Integer> map2 = Collections.singletonMap("Test", 1111);
	System.out.println(map2.get("Test"));
	// Now if you try to add one more entry to this Singleton Map it'll throw UnsupportedOperationException
	
	map2.put("Demo", 999); // Runtime Exception
	
	
	


	}

}
