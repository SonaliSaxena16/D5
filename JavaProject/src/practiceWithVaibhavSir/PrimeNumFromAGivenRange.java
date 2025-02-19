package practiceWithVaibhavSir;

public class PrimeNumFromAGivenRange {

	public static void main(String[] args) {

		int start=1, stop=5, count;
		
		for(int num=start; num<=stop; num++) {
			count=0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("Prime no. " + num);
			}
			
		}
		
	}

}
