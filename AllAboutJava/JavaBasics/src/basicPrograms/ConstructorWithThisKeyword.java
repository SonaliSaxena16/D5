package basicPrograms;

public class ConstructorWithThisKeyword {

	String name1 = "Raj";
	int age1 = 40;
	
	
	public ConstructorWithThisKeyword(String name,int age){
		
		this.name1=name;
		this.age1=age;
//		System.out.println(name);
//		System.out.println(age);
	}
	
	public static void main(String[] args){
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword();	
	}
}
