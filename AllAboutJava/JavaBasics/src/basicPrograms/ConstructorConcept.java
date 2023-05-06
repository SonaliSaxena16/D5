package basicPrograms;

public class ConstructorConcept {
 
	public ConstructorConcept(){ //No return type no static no data type - Just same as class name
		System.out.println("Default Constructor");//As doesn't have parameters passed
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single parameter constructor");// 1 Parameter constructor
	System.out.println("value of i is:"+" "+ i);
	}
	

	public ConstructorConcept(int i,int j){
		System.out.println("Double parameter constructor");// 2 Parameter constructor
	System.out.println("value of i & j:"+" "+i+" "+j);
	}
	
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
//		ConstructorConcept obj1 = new ConstructorConcept(10);
//		ConstructorConcept obj2 = new ConstructorConcept(20,30);
	}

}
