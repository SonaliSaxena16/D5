package practiceWithVaibhavSir;

public class StarPattern8Challenge {

	public static void main(String[] args) {

//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14
		int count=0;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				count++;
				System.out.print(count + " "); // Why I cannot direct do count++ in Sopln, & remove Line 16 ?
			}
			
			System.out.println(" ");
		}
	}
}
