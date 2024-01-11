package practiceInterviewQue;

public class Swap {

	public static void main(String[] args) {

		String str = "naman";
		
		char c;
		
		String newWord = " ";
		
		for(int i=0; i<=str.length(); i++){
			
			for(int j=0; j<=i; j++) {
				
				c = str.charAt(i);
				
				if(j==i) {
					
					System.out.println(c);
				}
			}
			
		}
		
		
		
	}

}
