package practiceWithVaibhavSir;

public class StarPattern9 {

	public static void main(String[] args) {

//		 *
//		***
//	   *****
//	  *******
//	   *****
//	    ***
//	     *
		
		for(int i=1; i<=4; i++) {
			
			for(int s=4; s>=i; s--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Another loop for lower triangle 
		
for(int i=1; i<=4; i++) {
			
			for(int s=1; s<=i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
