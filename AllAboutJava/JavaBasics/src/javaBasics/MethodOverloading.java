package javaBasics;

public class MethodOverloading {
	// Polymorphism - One type of Data used in Many Forms
	// A method cant have another method inside one method
	// A class cannot have Methods with the same Signature i.e. same name & param but shud have with same name & different Parameters
	// Same method name with same parameters aren't allowed
	// Ex- I've used Overloading in Selenium Action Class, Implicit Wait, Assert	
	
	public void eat() { // No parameter
		System.out.println("no param");
	}
	
	public void eat(String cow) { // 1 Parameter
		System.out.println("1 param");
	}
	
	
	public void eat(String dog, String cat) {
		System.out.println("2 param");
	}

		
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.eat();
		obj.eat("cow");
		obj.eat("dog", "cat");
		
	}
	
	
	
}
