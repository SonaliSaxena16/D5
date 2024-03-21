package interviewQue;

public class NumberSwapWith3rdVar {

	public static void main(String[] args) {

		int a=10, b=20, t;
		
		
		t=a;
	//	System.out.println(t); 
		
//		a=t;
//		System.out.println(t); a=t or t=a will produce DIFFERENT result
	
		a=b;
//		System.out.println(a);
		
		b=t;
		
		System.out.println("a= " + a);
		
		System.out.println("b= " + b);
	}

}
