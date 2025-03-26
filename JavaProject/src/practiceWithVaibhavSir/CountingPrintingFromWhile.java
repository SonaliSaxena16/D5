package practiceWithVaibhavSir;

import java.util.Scanner;

public class CountingPrintingFromWhile {    

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num from where you want to start counting");

		int num = s.nextInt();
		
		// Print counting from 1 to 8
		int i=1;
		
		while(i<=num) {
			System.out.println(i);
			i=i+1;
		}
		System.out.println("Counting Printed");		
		
	}

}
