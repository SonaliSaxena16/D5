package linkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		// LinkedList is a default class in Java
		// It can be used as a List, Stack, Queue
		// It allows the null entry
		// It's dynamic in nature
		// Hence insertion & deletion can be easily implemented
		// It can contains duplicate elements
		// Not synchronized, hence not thread-safe
		// Here, Manipulation of Data is fast bcz we dont need to shift any data unlike ArrayList from midlle
		// Here, we can insert at the middle by easily cutting the node & attaching the desired node with it rather than shifting all the elements to RHS
		// LinkedList Constructor
		// LinkedList Methods
		// LinkedList (Collection c)
		
		LinkedList<String> names = new LinkedList<String>(); 
		System.out.println(names.size());
		
		names.add("Tom");
		names.add("Naveen");
		names.add("Reea");
		names.add("Tara");
		System.out.println(names.size());
		System.out.println(names);

		System.out.println(names.get(0));
		System.out.println(names.get(1));
	//	System.out.println(names.get(2)); // IndexOutOfBoundsException bcz Index 2 doesn't exists
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(4, "Steve");
		System.out.println(names);
	
		names.add(2, "Ram");
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>(); 

		users.add("Peter");
		users.add("Trump");
		
		names.addAll(users);
		System.out.println(names);

		names.addFirst("Kamala");
		System.out.println(names);
		
		names.addLast("Shivin");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);

		names.removeAll(users);
		System.out.println(names);

		names.removeFirst();		
		System.out.println(names);

		names.removeLast();
		System.out.println(names);

		names.clear();
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>(); 
		System.out.println(lang.size());
		
		lang.add("Java");
		lang.add("Python");
		lang.add("Ruby");
		lang.add("JavaScript");
		System.out.println(lang.size());

		// reverse the LinkedList
		Iterator<String> itr = lang.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// using for-each loop
		
		for(String e : lang) {
			System.out.println(e + "Sonali");
		}
		
		// sort
		
		Collections.sort(lang);
		System.out.println(lang);
		
	}

}
