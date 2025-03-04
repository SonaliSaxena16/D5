package practiceWithVaibhavSir;

public class SumOfIntegersEntered {

	public static void main(String[] args) {

		int num=549, rem, sum=0;
		
		while(num>=0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		
		System.out.println(sum);
	}
}
