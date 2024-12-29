package MainMethod;

// Interview Question1 - Can main() be OVERLOADED ?
// Ans - Yes however JVM will try to search for exact method signture i.e.(public static void main(String[] args))
// JVM does not know any other main method if not found String[] args these parametrs JVM will not execute ur code

// Interview Question2 - Can main() be OVERRIDDEN ?
// Ans - No, we cannot override main method of java because a static method cannot be overridden.
// Bcz static method in java is associated with class and object creation isn't required 
// whereas the non-static method is associated with an object.

public class mainMethodOverloading {

	public static void main(String args){
		System.out.println("main method 2");
	}
	
	public static void main(int a){
		System.out.println("main method 3");
	}
	
	public static void main(int a, int b){
		System.out.println("main method 4");
	}
	
	public static void main(String[] args) {
		System.out.println("");
	}
	
	public static void main(String[] args) {
		System.out.println("main method 1");
		
		main("Sonali");
		main(10);
		main(40,50);
		
		// Output 
	//	main method 1
	// main method 2
		// main method 3
		// main method 4
	}
	
}