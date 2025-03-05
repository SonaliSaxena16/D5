package practiceWithVaibhavSir;

public class PrintNameInStarPattern {

	public static void main(String[] args) {
		
		//s
		//so
		//son
		//sona
		//sonal
		//sonali
		
		char ch[] = {'s','o','n','a','l','i'};
		
		for(int i=0; i<ch.length; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(ch[j]);
			}
			
			System.out.println();
		}
	}
}


