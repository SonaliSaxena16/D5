package constructorBasics;

public class ConstShowsDefaultValues {

		int id;  
	//	String name; 
char c;
	//method to display the value of id and name  
	void display(char c,String name ){
		System.out.println(c + " " + name);
	} 

	void show(int empid) {
		System.out.println(empid); 
	}
	
	void showsDefaultValueOfInt() {
		System.out.println(id); 
	}
	
	void showcaseCharDefValue() {
		System.out.println(c); // It'll print a little square, means that it's not a printable character - as expected.
		System.out.println('\u0000'); // It'll print a little square, means that it's not a printable character - as expected.

	}

	public static void main(String args[]){ 

		//creating objects  
		ConstShowsDefaultValues s1=new ConstShowsDefaultValues();  
		//ConstShowsDefaultValues s2=new ConstShowsDefaultValues();  

		s1.display('z', "Mira"); 
		s1.show(8);
		s1.showsDefaultValueOfInt();
		s1.showcaseCharDefValue();
		
	}  
}  


