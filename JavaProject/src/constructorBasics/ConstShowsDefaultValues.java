package constructorBasics;

public class ConstShowsDefaultValues {

	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);} 
	void show() {System.out.println(id); }
	  
	public static void main(String args[]){ 

		int id1=9;  
	//creating objects  
		ConstShowsDefaultValues s1=new ConstShowsDefaultValues();  
		//ConstShowsDefaultValues s2=new ConstShowsDefaultValues();  
	//displaying values of the object  
	s1.display(); 
	s1.show();
	}  
	}  
	
	
