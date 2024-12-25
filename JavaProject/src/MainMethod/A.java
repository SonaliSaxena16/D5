package MainMethod;

public class A {

//FAMOUS INTERVIEW QUE- Can we call main method from different class ? Yes shown below..
	//Output will go in loop for infinite times at last throws error due to memomy full
	public static void main(String[] args) {
		System.out.println("A class main method");
		B.main(args);
	}

}
