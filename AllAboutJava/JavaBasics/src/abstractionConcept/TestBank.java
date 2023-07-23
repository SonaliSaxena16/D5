package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		hb.credit();// credit method is same in Parent & child still in output we are getting result as per shown
// in child class. Bcz obj ref is ofchild class so we are getting child class implementation in output.
		hb.debit();
		hb.loan();
		hb.funds();
		
//Here we are trying to achieve run time POLYMORPHISM- We've created the reference of child class, but accessing 
// it through Parent Class reference variable
	
//Bank b = new Bank();//Can't instantiate the Bank class bcz it is abstract.We cannot create obj of ABSTRACT CLS/Interface
//Hence we've created the object of Child class, but accessing that obj through Parent Class variable 

		Bank b = new HDFCBank();
		
		b.loan();
		b.credit();
		b.debit();
//	b.funds -- Not available bcz it as child cls() and can only be accessed by using child cls obj with child cls reference
	}

}
