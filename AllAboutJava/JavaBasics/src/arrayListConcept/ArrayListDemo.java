package arrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Need to import ArrayList from Java.util package
		// ArrayList is the best choice if we want Retrieval of data bad choice if we want to insertion/deletion from middle
		// ArrayList is a Dynamic Array as we are not worried about the size or limit
		// How to define ArrayList using - 1. Raw Approach using default generics(means no dataType)
		
	//	Example no. 1
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Sonali");
		ar.add(12.67);
		ar.add(97809566785l);
		ar.add('$');
		ar.add(true);
		
		System.out.println(ar);
// NOTE- Java doesn't like this as you haven't defined the DataType you've used Raw Approach
		
//		Example no. 2
		ArrayList<Object> aro = new ArrayList<Object>();
		aro.add(100);		//0
		aro.add("Sonali");	//1
		aro.add(12.67);		//2
		aro.add(97809566785l); //3
		aro.add('$');		//4
		aro.add(true);		//5
		
		System.out.println(aro.size()+" "+"ArrayListSize");
		System.out.println(aro.get(1)+" "+"ArrayListEleAt1Position");
		
		System.out.println("LowestBound/Index="+0);
		System.out.println("HighestBound/Index="+ (aro.size()-1));
//Now am adding some more values to ArrayList as size has no limit in it
		
		aro.add(1000);	//6
		aro.add("increased"); //7
		System.out.println(aro.size()+" "+"ArrayListUpdatedSize");
//	ArrayListUpdatedSize is now 8 hence proved ArrayList in Collection is a  Dynamic Array
// NOTE - Now there's no warning from Java, if you want to add mix data type values Java says at least provide Object Wrapper Class as a argument
		
	}

}
