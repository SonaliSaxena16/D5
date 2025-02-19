package practiceWithVaibhavSir;

public class SirLogicOfPrimeNoInRange {

	public static void main(String[] args) {

		int start=2, stop=5, count=0;
		
		for(int i=start; i<=stop; i++) {
			
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			/*if(count==0) {
				System.out.println("Prime"+i);
			}
			
			else {
				System.out.println("No Prime " + i);
			}*/
		}
		System.out.println(count);
		
}
}