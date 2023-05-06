package abstractionConcept;

public abstract class Bank {
//Here we are achieveing Partial Abstration by using Abstract Keyword, means we've 1 Method which is
// Atract in nature, however we've 2 more methods which are common for all child classes
//We can achieve 100% abstration when all methods wud be abstract in nature
//We cannot create obj of ABSTRACT CLASS
//An abstract class must have etleast 1 abstract() 
//Abstract cls can have ANY KIND OF VARIABLE LIKE- STATIC,FINAL	or normal with primitive data types
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	public abstract  void loan();// Its a ABSTRACT() as it doesn't have a Method Body
	 
	
//Below are non abstract methods
	public void credit(){
		System.out.println("Bank credit");
	}
	
	public void debit(){
		System.out.println("Bank debit");
	}
	
	
	
}
