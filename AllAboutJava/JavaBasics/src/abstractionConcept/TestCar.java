package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.openroof();
		System.out.println(b.wheels);
		
		Car c = new BMW();//It's called dynamic polymorphism or Topcasting or Typecastingg
		System.out.println("____________");
		c.start();
		c.stop();
		c.refuel();
		System.out.println(c.wheels);
	}

}
