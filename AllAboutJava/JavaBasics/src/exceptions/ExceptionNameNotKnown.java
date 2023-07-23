package exceptions;

public class ExceptionNameNotKnown {

	
	  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0; 
		      
		   }
		   
		   	catch(Exception e)
		   {
		   		System.out.println(e);
		   		
		   } // When not sure abt exception name
		   
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		}  
