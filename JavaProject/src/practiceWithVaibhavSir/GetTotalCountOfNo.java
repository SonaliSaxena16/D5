package practiceWithVaibhavSir;

import java.util.Scanner;

public class GetTotalCountOfNo {

	public static void main(String[] args) {

		// WAP to take user input for start & end no's and program would count the total no enter so far in the range from start no. till end no.
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start num");
		int startNum = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Last num");
		int lastNum = sc1.nextInt();
		
		for(int i=startNum; i<=lastNum; i++) {
			count++;
		}
		
		System.out.println("Total number entered by user is : " + count);
	}

}
