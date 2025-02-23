package practiceWithVaibhavSir;

public class StartPattern6 {

	public static void main(String[] args) {

//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i=1; i<=5; i++) {
			
			for(int s=1; s<i; s++) { // If u want space in 1st row you can do s<=i else do s<i means 1<1 it'll fail for the 1st time
									// and come to the next iteration 'j' loop. Next time i would be incremented as 2now it'll check 1<2, pass then from 2nd row it'll print space.
				System.out.print(" ");
				}
			
			for(int j=5; j>=i; j--) {
				System.out.print("*");
				}
			System.out.println(" ");

		}
			
		}
}

