package superKeyword;

public class Animal {
	String color = "Black";
	
	public void noOfLegs() {
		System.out.println(4);
	}
	
	public void noOfEyes() {
		System.out.println(2);
		this.noOfLegs();
	}
	
	
}

