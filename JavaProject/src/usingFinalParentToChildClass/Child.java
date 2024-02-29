package usingFinalParentToChildClass;

public class Child extends Parent{ //extends Parent

//	public void start(){ // If uncommented this method it'll give error as Final keyword is mentioned in Parent hence cant be overridden
//		System.out.println("Parent class-- start method");
//	}
	
	
	public void stop(){
		System.out.println("Parent class-- start method");
	}
	
	
	public static void main(String[] args) {

	}

}
