package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.openroof();
		System.out.println(b.wheels);
	//	Car c = new Car(); // Can't create object of Car bcz Car is an Interface, so we can access the Car Interface methods & var by creating a child cls obj and accessing with Car cls ref var.
		Car c = new BMW();//It's called dynamic polymorphism or Topcasting or Typecasting
		System.out.println("____________");
		c.start();
		c.stop();
		c.refuel();
	//	c.openroof(); // can't be accessed
		System.out.println(c.wheels);
	}

}
