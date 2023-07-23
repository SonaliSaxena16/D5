package stringConcept;

public class StringBasics {

	public static void main(String[] args) {

		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);  
		
		
		
		// Test IS String Immutable (means can't be changed) ??
		
		String s="Sachin";  
	   s.concat(" Tendulkar");//concat() method appends(add the String value from the end to the original String)  
	   System.out.println(s);//will print Sachin because strings are immutable objects  
			
// OR if we explicitly assign it to the reference variable, then it'll refer to "Sachin Tendulkar" object.  
	   			
	   			String st="Sachin";  
	   		    st = st.concat(" Tendulkar");  
	   		   System.out.println(st);  
	}  
}
