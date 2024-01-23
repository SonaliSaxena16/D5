package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>(); // String type generic defined
		// 1 Add Method
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");
//		System.out.println(ar1.size());
//		System.out.println(ar1);
		
		
		ArrayList<String> ar2 = new ArrayList<String>(); // String type generic defined
		ar2.add("Testing");
		ar2.add("DevOps");
		
		// 2a AddAll Method to combine 2 arrayList
		ar1.addAll(ar2);	// Combine ArrayList1 elements with ArrayList2
		
		// 2b Add ele in ar1 at specific position. Fetch ele from ar2
		ar1.addAll(2, ar2);	// I want to add ele in ArrayList1(ar1) all the ele of ArrayList2(ar2) from 2nd position in ArrayList1
		//	System.out.println(ar1);
		
		
	// 3 Clear Method to create empty ArrayList
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("C#");
		
	//	System.out.println(ar3);
		ar3.clear();
		
		// 4 Clone Method
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		// 5 Contains Method, it return Boolean chk if value Contained/Present in ArrayList or not
		
		System.out.println(ar1.contains("Java"));
		
		// 6a indexOf Method; You can use indexOf() as well to chk if ele is present in the list privilige is u can get the postion(index) also 
		
		System.out.println(ar1.indexOf("Ruby")>0);
		
		// 6b indexOfLast Method
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa")); 

		int i = list1.lastIndexOf("Naveen");
		System.out.println(i + "index");
		
		int notInList = list1.lastIndexOf("test");
		System.out.println(notInList + "pass which is not in list");
		
	  // 7 Remove from Index or byPassing value directly
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.remove("Lisa");
		System.out.println(list1);
		
		// 8 removeIf method(this methods expects condition from you ex - remove if number divisible by 0)
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers + "removeIf prints even number only");
	
		
		ArrayList<Integer> nmbr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		nmbr.removeIf(num -> num%2!=0);
		System.out.println(nmbr + "removeIf prints odd number only");
		
// 9 retainAll() - It brings/retain back the Collection/List of all those ele which you've passed in Collection(ex - Tom)
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom")); 
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("Tom"));
		System.out.println(namesList + "SingleTon()");

		// 10 subList from Main ArrayList
// NOTE** sub will give u till lastIndex-1 means it'll start from printing index 3 to 6-1

	ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

	ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(3, 6));
		
		System.out.println(subList + "subList");
		
// 11 toArray()
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom")); 
	Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr) + "toArrays"); // This statmnt will return value in Array ["Naveen","Tom","Peter","Steve","Lisa","Tom"]
		
		for(Object o : arr) {
			System.out.println(o +" " + "toString()"); // This statmnt will return value in String as Vertical list
		}
		
	}

}
