package practiceWithVaibhavSir;

public class PrimeNum {

		static int num=5, count=0;
		
	public static void main(String[] args) {
		
		for(int i=1; i<=num; i++) {
			if(num%i==0)
			count++;
		}
		
		if(count==2) {
			System.out.println("Prime");
		}
		
		else {
			System.out.println("Composite");
		}
		
		
		// OR
		
		
//		for(int i=2; i<num; i++) {
//			if(num%i==0) {
//				count++;
//			}
//			
//		}
//		
//		if(count==0) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not prime");
//		}
	}

}
