package interviewQue;

public class Is7PrimeNum {

	public static void main(String[] args) {

		int num=7, factorCount=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				factorCount++;
			}
			
			if(factorCount==2) {
				System.out.println(num +" Prime number");
			}
		}
		
		
	}

}
