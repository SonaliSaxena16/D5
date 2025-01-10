package superKeyword;


public class A {

	 A(){
			System.out.println("Parent class constructor");
		}
	 
	 A(int i){
		System.out.println("Parent class constructor with i value:"+ i);
	}
	

	 A(int i,String name){
		System.out.println("Parent class constructor with i & name value : " + i +" , "+name);
	}
	
	 public static void main(String[] args) {
		A a = new A();
		A a1 = new A(10);
		A a2 = new A(10,"Sonali");
	}

}
// NOTE: If u want to call all the constructors of class A using Super in child class B then u must
// create 3 different constructors as per parameters.
// You cannot have 2 two Super kweywords in one constructor
