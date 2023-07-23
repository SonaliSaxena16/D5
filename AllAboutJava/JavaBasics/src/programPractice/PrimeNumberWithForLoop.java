package programPractice;

import java.util.Scanner;

public class PrimeNumberWithForLoop {

	public static void main(String[] args) {

		// 2 is the lowest Prime Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please");
		int num = sc.nextInt();
		
		int i, factorCount=0; // either hardcode value num=3  or comment above 3 lines

		for(i=1; i<=num; i++){
			if(num%i==0) {
				factorCount++;
			}
		}
			
			if(factorCount==2) {
				System.out.println("Prime " + num);
			}
			else {
				System.out.println("Not Prime " + num);

			}
		}
	}

