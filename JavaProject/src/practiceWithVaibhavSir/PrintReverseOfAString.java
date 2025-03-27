package practiceWithVaibhavSir;

public class PrintReverseOfAString {

	public static void main(String[] args) {

		String str = "sonali";
		char ch[] = str.toCharArray();
//		for(int i=str.length()-1; i>=0; i--) {
//			
//			System.out.print(str.charAt(i));  
//		}
		
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}

}
