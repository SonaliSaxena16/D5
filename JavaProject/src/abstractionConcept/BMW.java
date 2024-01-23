package abstractionConcept;

public class BMW implements Car{

	int wheels = 5;
	
	@Override
	public void start() {
		System.out.println("BMW Starts");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stops");
	}

	@Override
	public void refuel() {
		System.out.println("BMW Refuel");
	}

	//This class can have non-overriden method also
	public void openroof(){
		System.out.println("BMW Openroof");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
