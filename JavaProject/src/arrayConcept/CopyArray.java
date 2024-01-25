package arrayConcept;

public class CopyArray {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40};
	//	int arr2[]= new int[4];
				// OR
		int arr2[]= new int[arr.length];
	
	System.out.println("Values in 1st Array");
	for(int i=0; i<arr.length;i++) {
		arr2[i]=arr[i];
		System.out.print(arr[i] + " ");
	}
	
	System.out.println("\nValues in 2nd Array");
	for(int i=0; i<arr2.length;i++) {
		System.out.print(arr2[i] + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
