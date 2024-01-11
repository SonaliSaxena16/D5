package practiceInterviewQue;

public class ExceptionPrac {

	public static void main(String[] args) {
		/* Online Java Compiler and Editor */

		    try  {  
		        int a = 3/0;  
		        System.out.println("a = "+a);  
		    }  

		    catch(Exception e){
		        System.out.println(e);
		    }  

		    catch(ArithmeticException ex){
		        System.out.println(ex);
		    }    

		} 


	}
