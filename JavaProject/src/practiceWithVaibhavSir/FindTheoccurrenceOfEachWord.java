package practiceWithVaibhavSir;

import java.util.Scanner;

public class FindTheoccurrenceOfEachWord {

	public static void main(String[] args) {

		String str[] = {"hello hello world welcome to the hello programming world"}; 

		for(int i=0; i<str.length; i++){

			for(int j=i+1; j<str.length; j++){

				if(str[i]==str[j]){
					str[i]=" ";
					
				}
				
			}
			 
			System.out.println("New String is : " + str[i]);
		}
	}
}
