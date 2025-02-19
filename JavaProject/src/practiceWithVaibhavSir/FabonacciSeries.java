package practiceWithVaibhavSir;

public class FabonacciSeries {

	public static void main(String[] args) {

		int a=0,b=1,c, count=0;
		for(int i=1; i<=5; i++) {
			c=a+b;
			System.out.println(c);
			count++;
			a=b;
			b=c;
		}
		
		System.out.println("Count is " + count);
	}
}
