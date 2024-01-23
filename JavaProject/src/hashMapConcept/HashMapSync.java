package hashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {

		// SynchronizedMap Method in Collections Class
		Map<String, String> map1 = new HashMap<String, String>(); 
		map1.put("1", "Naveen");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");
		
		// Create SynchronizedMap
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		// Concurrent HashMap : It doesn't throw any ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>(); 
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Ruby");
		concurrentMap.put("C", "Python");
		
		System.out.println(concurrentMap.get("A"));
		
// Ques - Can multiple threads write in the same segment ?
// Ans - No, thread acquires a LOCK on segment in put() operation. At a time only 1 thread can write in that segment.

// Ques - Can 2 threads write in the different segment ?
// Ans - Yes, 2 threads are allowed to write concurrently in different segments.
		
// Ques - Can multi-thread read from that same segment ?	
// Ans - Yes, thread doesn't acquire a LOCK on segment in get() operation & any number of threads can read data from it &
// suppose at the same time if put() is working or someone is writting the value then the reading user will get the latest values
	
// Ques - If one thread is writting in a segment, can another read from that segment ?
// Ans - Yes, in this case the last updated value will be seen to the reading thread.
		
	
	}

}
