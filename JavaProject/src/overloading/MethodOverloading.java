
package overloading;

public class MethodOverloading {
//	 Method Overloading is same Method name but different Parameter
// A class cannot have Methods with the same Signature i.e. same name & param but shud have with 
//	same name & different Parameters
//	 Ex- I've used Overloading in Selenium - Action Class, Implicit Wait, Assert	
	
	public void eat() { // No parameter
		System.out.println("no param");
	}
	
	public void eat(String cow) { // 1 Parameter
		System.out.println("1 String param");
	}
	
	
	public void eat(String dog, String cat) {
		System.out.println("2 String param");
	}

	public void eat(int leg, int hand) {
		System.out.println("2 int param");
	}
		
	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		obj.eat();
		obj.eat("cow");
		obj.eat(2,2);
		obj.eat("dog", "cat");
		
	}
	
	
	
}
