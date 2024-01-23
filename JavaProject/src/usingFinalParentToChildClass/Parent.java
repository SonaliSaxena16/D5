package usingFinalParentToChildClass;

public  class Parent {
// To prevent INHERITANCE also Final is used
	
	
	public final void start(){
		// To prevent METHOD OVERRIDING for a specific class while extending Parent by child, FINAL can be used
//Here we are try to achieve method overriding as we've create same method sign in class A & B with no paramerters however different implementaition
		System.out.println("Parent class-- start method");
	}
	
	
	public static void main(String[] args) {

	}

}
