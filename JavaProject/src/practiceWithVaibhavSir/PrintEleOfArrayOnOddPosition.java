package practiceWithVaibhavSir;

public class PrintEleOfArrayOnOddPosition {

	public static void main(String[] args) {

		int arr1[] = {7,6,5,4,3,2,1};
		
		for(int i=1; i<=arr1.length-1; i=i+2) {
			
			System.out.print(arr1[i] + " ");
		}
	}
}
