package exceptions;

public class TryCatchConcept {

		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
			   
		      int data=100/0;  
		   }
		   
		   
		
		   catch(ArithmeticException e)
		   	{
			   e.printStackTrace();
			   System.out.println(e);
		   }  
		   
		   catch(Throwable e)
		   	{
			   e.printStackTrace();
			   System.out.println(e);
		   }  
		   
		   finally {
				System.out.println("Error catched");
			}
		   
		   //rest code of the program will be executed
		   System.out.println("rest of the code...");  
		  }  
		}  
