package allAboutMainMethod;

public class mainMethodOverloading {
	// However JVM will try to search for exact method signture i.e.(public static void main(String[] args))
// JVM does not know any other main method if not found String[] args these parametrs JVM will not execute ur code

	public static void main(String[] args) {
		System.out.println("main method 1");
		
		main("Sonali");
		main(10);
		main(40,50);
	}

	public static void main(String args){
		System.out.println("main method 2");
	}
	
	public static void main(int a){
		System.out.println("main method 3");
	}
	
	public static void main(int a, int b){
		System.out.println("main method 4");
	}
	
}