package programPractice;

public class CheckPrimeNumber1To100 {

	public static void main(String[] args) {
		
		int i,factorCount,j;
		
		for(i=1; i<=100; i++) {
			
			factorCount=0;
			
			for(j=i; j<=i; j++) {
				
				if(i%j==0) {
					factorCount++;
				}
			}
			
			if(factorCount==2) {
				System.out.println(i);
			
		}
		

		}
	}

}
