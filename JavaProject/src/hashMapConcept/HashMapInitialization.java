package hashMapConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;
	
	static {
		
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		// 1 Using HashMap Class
		
		HashMap<String, String> map1 = new HashMap<>(); // Can write like this without giving arguments to RHS
Map<String, String> map2 = new HashMap<>();	// Can use Upcasting as well to write as Using ParentCls Map calling childCls obj HashMap

		// 2 static way : static hashmap:
		System.out.println(HashMapInitialization.marksMap.get("A"));
		
		// 3 immutable map with singleEntry only 
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test")); // Till here code gets executed successfully
	//	map3.put("abc", 200); // If you run this, it'll give UnsupportedOperationException bcz it's a singleton(), you can add only 1 time as a parameter in singleton()
		
		// 4 JDK 8 - Stream.of - Creating 2D array of Strings using Stream & collecting in the form of Map
		Map<String, String> map4 = Stream.of(new String[] [] {
			{"Tom", "A Grade"},
			{"Naveen", "A+ Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));

		
		// using SimpleEntry : Immutable(Can't be changed) Map 
		
		Map<String, String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Naveen"));
		map5.put("Lisa", "C#");
		System.out.println(map5.get("Lisa"));
		
		// JDK 1.9
		Map<String, String> emptyMap = Map.of();
	//	emptyMap.put("Tom", "A Grade");// // If you run this, it'll give UnsupportedOperationException bcz it's an emptyMap u can't add any value to it
	//	System.out.println(emptyMap.get("Tom"));
		
		
		// Singleton Map
		Map<String, String> singletonMap = Map.of("K1", "V1");
		System.out.println(singletonMap.get("K1"));
		singletonMap.put("K2", "V2"); //If you run this, it'll give UnsupportedOperationException bcz it's a singletonMap() u can't more than one 
		
		// Multi-Values Map : max 10 pairs can be stored
		Map<String, String> multiMap = Map.of("K1","V1","K2","V2","K3","V3");
		System.out.println(multiMap.get("K3"));
		
		// ofMapEnteries method : no limitations to add pairs of Key-Value
		// Immutable Maps:
		Map<String, Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200),
				new AbstractMap.SimpleEntry<>("C", 300)
				);
		
		System.out.println(map7.get("C"));
	//	map7.put("D", 400); //If you run this, it'll give UnsupportedOperationException bcz it'll generate immutable Map Object
		
		
		
	// Maps using Guava Dependency (add in pom,xml if u using maven project)
	//	ImmutableMap.Of
		
		
		
		
		
		
		
		
		
	}

}
