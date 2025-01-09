package stringConcept;

public class StringMethods {

	public static void main(String ar[]) {
		
		//  toUpperCase() and toLowerCase() method 
		
	String s="Sachin";    
	System.out.println(s.toUpperCase());//SACHIN    
	System.out.println(s.toLowerCase());//sachin    
	System.out.println(s);//Sachin(no change in original)    
	
	// trim() - eliminates white spaces before and after the String.
	
	String s1="  Sachin  ";    
	System.out.println(s1);//  Sachin      
	System.out.println(s1.trim() +" " +  "trimmed");//Sachin   
	
//startsWith() and endsWith()-checks whether the String starts/ends with the letters passed as arguments
	// returns Boolean
	
	String s2="Sachin";    
	 System.out.println(s2.startsWith("Sa"));//true    
	 System.out.println(s2.endsWith("n"));//true   
	
	
	 //charAt() Method - method returns a character at specified index
	 
	 String s3="Sachin";    
	 System.out.println(s3.charAt(0));//S    
	 System.out.println(s3.charAt(3));//h    2
	 
	 // length() - returns length of the specified String.
	 
	 String l = "Sachin";    
	 System.out.println(l.length());//6 
	 
	 // intern() - The intern() method in Java is used to store a copy of a string in the 
	 // string constant pool,
	 
	 String i=new String("Sachin");    
	 String in=i.intern();    
	 System.out.println(in);//Sachin   
	 boolean equal = i==in;
	 System.out.println("eqqqqq  " + equal);
	 
	// valueOf() - coverts given type such as int, long, float, double, boolean, char and char array into String 
	 
	 int a=10;    
	 String val=String.valueOf(a);    
	 System.out.println(val+10);    
	 
	//  replace() Method
	 
	 String j="Java is a programming language. Java is a platform. Java is an Island.";      
	 String replaceString=j.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
	 System.out.println(replaceString);    
	 
	} 
	
}
