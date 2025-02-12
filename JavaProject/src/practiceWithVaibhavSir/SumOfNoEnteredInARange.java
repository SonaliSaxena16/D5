package practiceWithVaibhavSir;

import java.util.Scanner;

public class SumOfNoEnteredInARange {

	public static void main(String[] args) {

		// WAP to take user input of Start num & End num & do the sum of that range and print the total amt and print the total count of number were in the range.
		
		int sum=0 , count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Num");
		int startNum = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Start Num");
		int lastNum = sc1.nextInt();
		
		for(int i=startNum; i<=lastNum; i++) {
			sum = sum+i;
			count++;
		}
		
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);

	}

}
