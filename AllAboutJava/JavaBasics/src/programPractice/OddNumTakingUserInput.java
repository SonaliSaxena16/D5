package programPractice;

import java.util.Scanner;

public class OddNumTakingUserInput {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number please");
			int num = sc.nextInt();
			
				if(num%2!=0) {
					System.out.println("Odd number " + num);
				}
				else {
					System.out.println("Even number " +num);
				}
			}
		}

