package exceptions;

public class ThrowsConcept {

	public static void main(String[] args)  throws ArithmeticException{
		
		ThrowsConcept obj = new ThrowsConcept();
		obj.sum();
		obj.div();
		System.out.println("ABC");
	}

	public void sum()  throws ArithmeticException{
		
		try{
			div();
		}
	catch(ArithmeticException e) {
		
	}
		System.out.println("done");
		
		}	

	public void div() throws ArithmeticException{
		try{
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			
		}
		System.out.println("done1");

	}
	
	
}
