package constructorBasics;

public class ConstructorConcept {

// A Constructor name is as same that of a ClassName
// It's does not have a Return Type
// It's of 2 types - Parameterised and Non-Parameterised
// It's main work is to initialise the Object
// If we give any return type to a Constructor,then Compiler would not throw any error rather it'll treat it as a Method
// Constructor called by new Keyword itself by Java Complier if not defined by user explicitly
// There's always a hidden/Default Constructor available in your Class if explicitly not mentioned
// However if you want make it Parameterised then you've to create it explicitly with the Parameters
// These can be Overloaded with the same name as that of a class but with differet Parameters
// How to call it ? It can be immediately called as soon as we instantiates (means created Obj of the class)	
	
// Super Key shud always be written in Child class and it shud be the first statement written inside a Constructor
// Super Key is used to call Parent Class Constructor
	public ConstructorConcept() {
		System.out.println("Default Cons");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("1 Para Cons");
		System.out.println("value of  i"+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("2 Para Cons");
		System.out.println("value of  i"+i);
		System.out.println("value of  j"+j);
	}
	
	public static void main() {
		
		ConstructorConcept cons = new ConstructorConcept(); // Default Cons
		ConstructorConcept cons1 = new ConstructorConcept(10); 
		ConstructorConcept cons2 = new ConstructorConcept(10,20); 
		}

}