package programPractice;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
// NOTE : value of j always depends on if operator be it ++ or -- if it's mentioned before i then j will get updated value. If it's mentioned after i like i++ or i-- then j will get the original value of i and in both the cases value of i is always updated when we print.
		int i = 1;
		System.out.println("i before increment" +" " + i);
		int j = i++; // post increment; in this case j will get original value of i which is 1 but value of value has been updated by ++ now  i=2 it'll print.
		
		System.out.println("i =" +" " + i);
		System.out.println("j =" +" " + j);
		
		System.out.println("********************");
		int a = 1;
		int b = ++a; // pre increment
		
		System.out.println("a =" +" " + a);
		System.out.println("b =" +" " + b);
		
		System.out.println("********************");
		
		int n = 2;
		int m = n--; //post decrement
		System.out.println("n =" +" " + n);
		System.out.println("m =" +" " + m);
		
		System.out.println("********************");
		
		int p = 2;
		int q = --p;
		System.out.println("p =" +" " + p);
		System.out.println("q =" +" " + q);
		
	}

}
