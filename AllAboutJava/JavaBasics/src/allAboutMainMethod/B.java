package allAboutMainMethod;

public class B {
	
//FAMOUS INTERVIEW QUE- Can we call main method from different class ? Yes shown below..
	//Output will go in loop for infinite times at last throws error due to memomy full
//Controlled shifting from A to B and B to A
	public static void main(String[] args) {
		System.out.println("B class main method");
		A.main(args);
	}

}
