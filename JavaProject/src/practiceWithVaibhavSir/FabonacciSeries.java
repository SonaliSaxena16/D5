package practiceWithVaibhavSir;

public class FabonacciSeries {

	public static void main(String[] args) {

		int a=0,b=1,c, count=0, sum=0;
	//	System.out.printf("%d\n%d\n",a,b);
		for(int i=1; i<=5; i++) {
			c=a+b;
			System.out.println(c);
			sum = sum+c;
			count++;
			a=b;
			b=c;
		}
		System.out.println(sum);
		System.out.println("Count is " + count);
	}
}
