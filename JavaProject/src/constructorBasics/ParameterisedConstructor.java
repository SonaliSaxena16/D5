package constructorBasics;

public class ParameterisedConstructor {

	 ParameterisedConstructor() {
		System.out.println("Default Cons");
	}
	
//	 ParameterisedConstructor(int i) {
//		System.out.println("1 Para Cons");
//		System.out.println("value of  i"+i);
//	}
//	
//	 ParameterisedConstructor(int i, int j) {
//		System.out.println("2 Para Cons");
//		System.out.println("value of  i"+i);
//		System.out.println("value of  j"+j); // Can have public or not , doesn't make any difference
//	}
	
	public static void main() {
		
		ParameterisedConstructor cons = new ParameterisedConstructor(); // Default Cons
//		ParameterisedConstructor cons1 = new ParameterisedConstructor(10); 
//		ParameterisedConstructor cons2 = new ParameterisedConstructor(10,20); 
		}

}
