package arrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
	
// 1, Collections.synchronizedList()
		
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
	// When we want to Add/Remove - we dont need explicit synchronization
	// But when we want to Fetch/Traverse value from List - we've to use explicit synchronization
	
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
// 2. CopyOnWriteArrayList is a class in Java - ThreadSafe/Synchronized already
// Whtever operation u perform Add/Remove/Fetch by default it'll be synchronized 
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
// Now we don't need any synchronization for any operation add/remove/fetch(traverse)
		
		Iterator<String> itr = empList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next() + " " + "synchronizedArrayList");
		}
		
		
	}
}
