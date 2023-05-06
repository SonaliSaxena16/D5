package methodOverridding;

public class Test {

	
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.cruise();
		b.stops();
		b.refuel();
		b.engine();
		System.out.println("-----------------");
		
		Car c = new Car();
		c.start();
		c.stops();
		c.refuel();
		c.engine();
		System.out.println("-------------------");
		
		
		Car c1 = new BMW(); // TypeCasting child cls obj to Parent cls i.e. UPCASTING fitting Child(small) obj into bigger (Parent)thing
		c1.start();
		c1.stops();
		c1.refuel();
		c1.engine();
		System.out.println("------------------");
		
	//	Car c2 = new Vehicle(); // DOWNCASTING isn't allowed as (Parent)Big thing can't be fitted into (Child)Smaller thing
	//	Car c2 = (Car)new Vehicle();// DOWNCASTING is possible like this, but it'll give u Run time exception i.e. ClassCastException
//for ex - String obj can't be cast to an Integer Obj if do so u'll get this exception
		
		Vehicle v = new Vehicle();
		v.engine();
		
	}
	
}