package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
// Compare on the basis of 1 Key-Value Pair, 2. On basis of key only 3. On basis of value only
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.put(1, "A");
		map3.put(2, "B");	
		map3.put(3, "C");
		map3.put(3, "D");
		
		// 1 On the basis of key-value : use equals method
		
		System.out.println(map1.equals(map2)); // true
		System.out.println(map1.equals(map3)); // false
		
		// 2 Compare HashMap for the same keys : use keySet() 
		System.out.println(map1.keySet().equals(map2.keySet()));
System.out.println(map1.keySet().equals(map3.keySet()));// It'll give true bcz it returns set and property of set is to ignore duplicate values
		
		
	// 3 find out the extra keys

	HashMap<Integer, String> map4 = new HashMap<Integer, String>();
	map4.put(1, "A");
	map4.put(2, "B");	
	map4.put(3, "C");
	map4.put(4, "D");
	
// Compare for map1 & map4 and find the extra key
	//  Combine the keys from both the maps : using HashSet bcz it has unique values only & does not maintain the key-value format 
	HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
	combineKeys.addAll(map4.keySet());
	System.out.println(combineKeys);// It'll print 1,2,3,4
	combineKeys.removeAll(map1.keySet()); // It'll remove all common and print the Unique value left i.e. 4 
	
	
	// Compare maps using Vaules
	
	HashMap<Integer, String> map5 = new HashMap<Integer, String>();
	
	map5.put(1, "A");
	map5.put(2, "B");
	map5.put(3, "C");
	
	HashMap<Integer, String> map6 = new HashMap<Integer, String>();
	
	map6.put(4, "A");
	map6.put(5, "B");
	map6.put(6, "C");
	
	HashMap<Integer, String> map7 = new HashMap<Integer, String>();
	
	map7.put(1, "A");
	map7.put(2, "B");	
	map7.put(3, "C");
	map7.put(4, "C");
	
	// if u want values where duplicates are not allowed : use ArrayList
	
	System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); // true
	System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); // false
	
	// if u want values where duplicates are allowed : use Set
	
	System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true
	System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); // true
	
	
		
	}

}
