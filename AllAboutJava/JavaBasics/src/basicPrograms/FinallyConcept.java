package basicPrograms;

public class FinallyConcept extends FinalConcept {

	public static void main(String[] args) {
	//	test1();
	//	test2();
	//	test3();
		test4();
		
	}

//	Example 1
	public static void test1(){
		try{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e){
			System.out.println("inside catch block");
	}
		finally
		{
			System.out.println("inside finally block");
		}
	}
// Example 2
public static void test2(){
	try{
		System.out.println("inside test2 method");
	}
finally
{
	System.out.println("execute this code even after explicitly throwing & catching an exception");
}
}

//Example 3

public static void test3(){
	int i=10;
	try{
		System.out.println("inside try block");
		int k=i/0;
	}
	catch(ArithmeticException e){
		System.out.println("Inside catch block");
		System.out.println("In java no nmbr can be divide by zero");
	}
	finally
	{
		System.out.println("execute this code even after catching real time exception");
	}
}

//Example 4
public static void test4(){
	int i=10;
	try{
		System.out.println("inside try block");
		int k=i/0;
	}
	catch(NullPointerException e){// Explicitly wrong type of exception passed correct wud be arithmentic.Still try block gets executed,
//compiler finds error in i/0 tries to throw exception but correct exception not found.Hence exception wud not be caught still execute finally block
		System.out.println("Inside catch block");
		System.out.println("In java no nmbr can be divide by zero");
	}
	finally
	{
		System.out.println("No execption caught still executing FINALLY BLOCK");
	}
}





















}