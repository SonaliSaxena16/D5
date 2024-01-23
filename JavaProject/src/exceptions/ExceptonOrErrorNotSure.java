package exceptions;

public class ExceptonOrErrorNotSure {

	  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }
		   
		   catch(Throwable e)
		   {  
			   System.out.println(e);
			   
		   }  // As Throwable is the Parent of Exception & Error class
		 
		   //rest code of the program will be executed
		   System.out.println("rest of the code...");  
		  }  
		}  
