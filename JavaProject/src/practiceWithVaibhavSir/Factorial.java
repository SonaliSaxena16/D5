package practiceWithVaibhavSir;

public class Factorial {

	static int num=5, fact=1;
	
	public static void main(String[] args) {

		
		// factorial of 5 = 5*4*3*2*1
						//  20*3*2*1
//							60*2*1
		//					120
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
//			1 = 1*1 = 1
//			1 = 1*2 = 2
//			2 = 2*3 = 6
//			6 = 6*4 = 24
//			24 = 24*5 = 120
					
		}
		System.out.println(fact);
		
	}

}
