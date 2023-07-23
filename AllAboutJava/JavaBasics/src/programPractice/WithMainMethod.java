package basicPrograms;

public class WithMainMethod {
	public void display(){
		int a = 10;
		System.out.println(a);
		a=25;
		System.out.println(a);
	}
	
	public static void main(String args[]){

		WithMainMethod dt = new WithMainMethod();
		dt.display();
		
	}
	
	
	

}
