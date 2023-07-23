package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		 
		//HashMap is a best choice for Search Operation
		// no order no indexing - 
		// stores value in key-value pair
		// key can be duplicated, value can be duplicated
		
// HashMap<Stringkey,Stringvalue> map1 = new HashMap<Stringkey,Stringvalue>; Give generics to your key value be it int,char,String type etc
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		
		// To set the value in map use put()
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "WashingtonDC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.put("France", "Furr");
	//	capitalMap.remove("France"); // It'll remove both key & value 
		
		System.out.println(capitalMap.get("USA")); // Pass the key as USA & it'll print the value washingtonDC
		System.out.println(capitalMap.get("UK")); // Now UK has duplicate values, and duplicates not allowed so it'll not throw exception rather it'll print the LATEST VALUE
		
		System.out.println(capitalMap.get("Germany")); // Pass the key as Germany but this key isn't available so it'll give null 
		System.out.println(capitalMap.get(null)); // It'll give you Berlin
		System.out.println(capitalMap.get("France") + "dekho");
		
		// 1 iterator for HashMap - over the keySet by using keySet();
		
		Iterator<String> it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
		//	System.out.println(it.next());// It'll print only keys mentioned on left ex-India,UK,USA,null
					//OR if you want to have key and value in the console you can do like this comment above line &
			String getMeKey = it.next();
	//	System.out.println(getMeKey);
		String value = capitalMap.get(getMeKey);
		System.out.println(getMeKey + " " +value);// Now it'll give you pair Key Value, however here you did not have any direct method to get key value you wrote 3 lines
		}
		
		System.out.println("22222222222222222222222222222222");
	
		// 2 iterator over the set(pair) : by using entrySet();
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next(); // 2 times string mentioned bcz entry will return Key & Value
		System.out.println(entry.getKey() +"-" + entry.getValue());
		}
		
		System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
	
		// 3 Iterate in HashMap using forEach() & Lamba
		
		capitalMap.forEach((k,v) -> System.out.println(k +" " + v));
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
