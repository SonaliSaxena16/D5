package basicPrograms;

public class StaticAndNonStatic {

	// THe scope of  Global variables will be availabile across all over the functions
	String name = "eelu"; //  Global variablers
	static int age = 12; // Global variablers
	
	public static void main(String[] args){
		
		eat(); // Static method can be called directly
		StaticAndNonStatic.eat(); //Static method can be called by class reference
		System.out.println(age); // Static variable can be called directly
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
	System.out.println(obj.name); // For non static obj we need to create obj & thru obj ref we can call such methods	
		obj.show(); //For non static var we need to create obj & thru obj ref we can call such var
	}
	
	public void show(){
		System.out.println("Non Static Method");
	}
	
	public static void eat(){
		System.out.println("Static Method");
	}
		
	
	public static void draw(){
		System.out.println("Static method calling thru different class In STATIC TEST CLASS");
	}

}
