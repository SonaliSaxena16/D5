package practiceWithVaibhavSir;

public class PrintEleOfArrOnEvenPosition {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7};
		
		for(int i=0; i<arr1.length; i=i+2) {
			
			System.out.print(arr1[i] + " ");
		}
	}
}
