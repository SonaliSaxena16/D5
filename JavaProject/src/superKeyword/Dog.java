package superKeyword;

public class Dog extends Animal{

	String color = "White";
	
	public void printColor() {
		
		System.out.println(super.color);
		System.out.println(color);
		super.noOfEyes();
	}
	
	

}
