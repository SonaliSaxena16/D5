package practiceWithVaibhavSir;

import java.util.Scanner;

public class TablePrintingFromWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the num for which you can Table to be printed for ");
		int num = sc.nextInt();

		int i=1, t;
		while(i<=10) {
			System.out.println(num*i);
			i=i+1;
		}
	}
}
