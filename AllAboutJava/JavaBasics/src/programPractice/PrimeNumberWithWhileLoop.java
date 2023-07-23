package programPractice;

import java.util.Scanner;

public class PrimeNumberWithWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please");
		int num = sc.nextInt();
		
		int i=1, factorCount=0;

		while(i<=num) {
			if(num%i==0) {
				factorCount++; }
			i++;
		}
			if(factorCount==2) {
				System.out.println("Prime");}
			else {
				System.out.println("NotPrime");
				
			}
		}
	}
