package superKeyword;

public class B extends A{
	
// Super Keyword shud always be written in Child class and it shud be the first statement written inside a Constructor
// Super Keyword is used to call Parent Class Constructor
//By creating 3 different obj of the same constructor having same name but different parameters (Constructor Overloading) accordingly to the Parameters passed in Object, a Constructor is called weather it's 1 argument 1 argument or no argument constructor , so here we have achieved CONSTRUCTOR OVERLODING
//The super() constructor refers immediate parent class object
// Call Parent class constructor thru child cls obj/constructor is called Constructor Chaining can be done by Using SUPER keyword.
// If you comment all super keyword in class B. It'll still goto cls A (bcz you're using Extends) but evertime before every B class constructor it'll call A cls 1st construcotr define which is non-parameterised then agn come to B cls and call accordingly if it's 1 para or 2 para.
	
	
	public B(){
	 super();// Super will immediately go to Parent class A and call its constructor
	 System.out.println("Child class constructor");
	}
 
	public B(int i){
		 super(i);// Super will immediately go to Parent class and call its constructor
		 System.out.println("Child class constructor 1 Parameter");
		}
 
	public B(int i,String name){
		 super(i,name);// Super will immediately go to Parent class and call its constructor
		 System.out.println("Child class constructor 2 Parameter");
		}

	
	public static void main(String[] args) {
		B obj = new B();//1st compiler come here to obj then go to B class constructor then Super keyword send it to A class
		B obj1 = new B(10);//After executing 1st super keyword,compiler agn come to obj1, now it'll ask compiler to go second B cls concstrtr and if you've written Super it'll call same constructor if A cls have qof 1 int para else call Basic constructor the 1st one written in A cls non-para.
		B obj2 = new B(10,"Sonali"); // same for this as happened for obj2.
	}

}
