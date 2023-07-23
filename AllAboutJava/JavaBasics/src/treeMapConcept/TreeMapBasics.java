package treeMapConcept;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasics {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		
		System.out.println(map); // It'll print in sorted(ascending order from small to large) works as per Key Defined
			// OR you can print keys like this
		map.forEach((k,v) -> System.out.println(k + v));
		
		
		System.out.println(map.firstKey()); // To print smallest digit in Key
		System.out.println(map.lastKey()); // To print largest digit in Key
		
		Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
		System.out.println(keyLessThan3k);
		
		Set<Integer> keyGreaterThan3k = map.tailMap(3000).keySet();
		System.out.println(keyGreaterThan3k);
		
		TreeMap<String, Integer> userMap = new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
	
	userMap.forEach((k,v) -> System.out.println(k + v)) ;
	
	// Use Comparator.reverseOrder() - If you want to print Keys in Ascending Order (Large to Small)
	
	TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
	map1.put(1000, "Tom");
	map1.put(2000, "Peter");
	map1.put(3000, "Steve");
	map1.put(11000, "Naveen");
	map1.put(1400, "Robby");
	
	System.out.println(map1);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
