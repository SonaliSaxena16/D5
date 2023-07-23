package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		//1 linkedHashSet used to remove Duplicate elements from ArrayList be it of any generics

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1,4,5,6,7,4,5,6,7,8,9,10,11,12,13));

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers); 
		
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		//need to chk vdo
		
		System.out.println(numbersListWithoutDuplicates + "Sonali");

		System.out.println(linkedHashSet + "Sonali");
		
	//2 Remove duplicates using Java 8 - Stream
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1,4,5,6,7,4,5,6,7,8,9,10,11,12,13));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
//		System.out.println(marksListUnique + " " + "Remove duplicates using Stream");
		
		
	}

}
