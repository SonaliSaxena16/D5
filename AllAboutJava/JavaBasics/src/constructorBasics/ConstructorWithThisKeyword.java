package constructorBasics;

public class ConstructorWithThisKeyword {
	
//this keyword can be used to refer current class instance variable,method & constructor
//The this() constructor refers to the current class object
// Left Hand Variable is Class/Instance/Global var & Right Hand side is Local var
	
	String name;
	int age;
	
	
	public ConstructorWithThisKeyword(String name,int age){
		
//	public ConstructorWithThisKeyword(String name1,int age1){ But this isn't a good practice

		this.name = name;
		this.age = age;
		
//		name=name1;
//		age=age1;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args){
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Raj",40);	

	}
}
