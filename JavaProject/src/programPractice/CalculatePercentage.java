package programPractice;

import java.util.Scanner;

public class CalculatePercentage {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained in 5 subjects");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int total = a+b+c+d+e; // or u can remove last 2 lines and complete logic here as (a+b+c+d+e)/5
		System.out.println("Total Marks " + total);
		double per = total/5;
		System.out.println("Percentage is " + per);
		
	}

}
