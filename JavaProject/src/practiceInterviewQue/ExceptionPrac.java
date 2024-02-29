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

//		    catch(ArithmeticException ex){ //If this line uncommented it'll give error bcz child exception cant be written below. It shud be above then followed by Parent Exception name 
//		        System.out.println(ex);
//		    }    

		} 


	}
