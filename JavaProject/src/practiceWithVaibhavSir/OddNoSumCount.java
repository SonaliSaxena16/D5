package practiceWithVaibhavSir;

public class OddNoSumCount {

	// WAP to 1. Print odd no. in a range starting from 7 to 99 then 2. get the sum of those odd no's then 3. print the total count of numbers entered in a range.
	
	
	static int num=11, sum=0, count=0;
	
	public static void main(String[] args) {

		for(int i=7; i<=num; i++) {
			count++;
			if(i%2!=0) {
				System.out.println("Odd no " + i);
				sum = sum+i;
				

			}
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);
	}

}


