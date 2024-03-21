package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 1000);
		compMap.put("Walmart", 2000);
		compMap.put("Amazon", 3000);
		compMap.put("Facebook", 4000);
		compMap.put("Cisco", 5000);
		
		System.out.println(compMap.size());
		// Convert HashMap keys to ArrayList :
		
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNamesList);
		
		// Convert HashMap Values to ArrayList :
		
		List<Integer> empValueList = new ArrayList<Integer>(compMap.values());
		System.out.println(empValueList);
		
	}

}
