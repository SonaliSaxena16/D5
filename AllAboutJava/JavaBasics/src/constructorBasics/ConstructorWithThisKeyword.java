package constructorBasics;

public class ConstructorWithThisKeyword {

	
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
