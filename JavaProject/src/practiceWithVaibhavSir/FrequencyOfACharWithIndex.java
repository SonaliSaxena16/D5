package practiceWithVaibhavSir;

import java.util.Scanner;

public class FrequencyOfACharWithIndex {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a string: ");
		// String str = sc.nextLine();
		// // sc.close();
		//
		// System.out.println("String entered by user is : " + str);
		// int[] freq = new int[256]; // Array to store frequency of characters (ASCII
		// size)
		//
		// // Count frequency of each character
		// for (int i = 0; i < str.length(); i++) {
		// freq[str.charAt(i)]++; // frequency array me str.charAt[i] pe jo aara hai use
		// print krdo
		// System.out.println(freq[str.charAt(i)]);
		// }
		//
		// // Display frequency with index
		// System.out.println("Character Frequencies with Index:");
		// for (int i = 0; i < str.length(); i++) {
		// char ch = str.charAt(i);
		// if (freq[ch] != 0) {
		// System.out.println("Character: '" + ch + "' | Index: " + i + " | Frequency: "
		// + freq[ch]);
		// freq[ch] = 0; // To avoid duplicate printing
		// }
		// }

		int count = 1;
		String str = "sonsalis";
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for(int j=i+1; j<ch.length; j++) { if(ch[i]==ch[j]) { count++;
			System.out.println(ch[i] + "-" + + i + "-" + count);
			}

			//			if(str.charAt(i)==i+1)// { Wrong condition, nahi aara samajh me kese loop lgau
			//				System.out.print("Output : " + str.charAt(i));
			
			}
		}
	}
}
