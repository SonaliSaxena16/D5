package practiceWithVaibhavSir;

public class PrintA2B3C4 {

	public static void main(String[] args) {

		char ch[] = {'a','2','b','3','c','4'};
				//{	  0   1   2   3   4   5   }	
		
		for(int i=0; i<=ch.length; i=i+2) {
			//String str = new String(ch);
			//int n = Integer.parseInt(str);
			
		//	str[i]*n(str[i+1]);
			
			System.out.println(String.valueOf(ch[i])*(Integer.parseInt(String.valueOf(ch[i+1]))));
		}
		
	}

}
