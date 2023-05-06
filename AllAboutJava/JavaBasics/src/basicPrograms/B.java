package basicPrograms;

public class B extends A{
	
	public B(){
	 super();// Super will immediately go to Parent class and call its constructor
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

	// By creating 3 different obj of the same constructor having same signature(name & parameters) so here 
	// we have achieved CONSTRUCTOR OVERLODING
	
	public static void main(String[] args) {
		B obj = new B();//1st compiler come here to obj then go to B class constructor then Super keyword send it to A class
		B obj1 = new B(10);//After executing 1 super keyword,compiler agn come to obj1, now it'll ask compiler to go second B cls concstrtr
		B obj2 = new B(10,"Sonali");
	}

}
