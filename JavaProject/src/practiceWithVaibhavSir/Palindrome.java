package practiceWithVaibhavSir;

public class Palindrome {

	public static void main(String[] args) {

		int i=0,j, counter=0;
		
		String str = "deified";
		
		j=str.length()-1;
		 
//		System.out.println(str.charAt(i));
//		System.out.println(str.charAt(j));
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				counter=1;
			}
				i++;
				j--;
			}
			
			if(counter==0) {
				System.out.println("Palindrome");
			}
			
			else {
				System.out.println("Not a Palindrome");
			
		}
		
	}
	}
