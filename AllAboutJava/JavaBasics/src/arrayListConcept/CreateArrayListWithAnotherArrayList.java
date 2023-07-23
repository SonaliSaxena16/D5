package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayListWithAnotherArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberSeries = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(numberSeries);
		System.out.println(numberSeries.get(1));

		
		ArrayList<String> strSeries = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#"));
		System.out.println(strSeries);
		System.out.println(strSeries.get(1));

	}

}
