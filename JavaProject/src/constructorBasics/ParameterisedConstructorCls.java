package constructorBasics;

public class ParameterisedConstructorCls {

	 ParameterisedConstructorCls() {
		System.out.println("No parameter user defined Cons");
	}
	
	 ParameterisedConstructorCls(int i) {
		System.out.println("1 Param Cons");
		System.out.println("value of  i "+i);
	}
	
	 ParameterisedConstructorCls(int i, int j) {
		System.out.println("2 Para Cons");
		System.out.println("value of  i "+i);
		System.out.println("value of  j "+j); // Can have public or not , doesn't make any difference
	}
	
	public static void main(String[] args) {
		
		ParameterisedConstructorCls cons = new ParameterisedConstructorCls(); // Default Cons
		ParameterisedConstructorCls cons1 = new ParameterisedConstructorCls(10); 
		ParameterisedConstructorCls cons2 = new ParameterisedConstructorCls(10,20); 
		}

}

// Output -
//"No parameter user defined Cons"
//"1 Para Cons"
//value of  i
//"2 Para Cons"
//value of  i
//value of  j

