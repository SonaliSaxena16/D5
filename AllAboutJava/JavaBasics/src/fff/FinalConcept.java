package fff;

// final can be used to mark a variable "unchangeable".
// final can also make a method not "overrideable" means one cannot change the implementation
// final can also make a class not "inheritable". i.e. the class can not be subclassed(child class can't be created)
public class FinalConcept {

	public static void main(String[] args) {

		
		
		final int i = 10;//FInal keyword used to define CONSTANT var whose value can't be changed
//		i=20; // Not allowed by Java Compiler
//		i=30;
	
		System.out.println(i);
	}

}
