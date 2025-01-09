package stringConcept;

public class StringBasics {

	public static void main(String[] args) {

	//	String s1="java";//creating string with string literal 
		String s1="Lava"; 
		String sz="Lava";
		System.out.println(s1 + sz);
		
		// Ex - how strings are immutable if I try to chng values
		String sb = new String("Demo ");
		sb.concat("class"); // Still it'll give Demo
		System.out.println("Unchanged sb = " + sb);
		// And now
		sb=sb.concat("class"); // Demo Class
		System.out.println("changed sb = " + sb);
		
	//	QUE - Difference in .equals() and == operator
	// IMP NOTE : == Operator used for Reference Variable(Address Var)Comparison & .equals() used for Content Comparison
		
	//	https://www.youtube.com/watch?v=i7vYjvJOIiw
			
		String as1 = new String("Stats");	
			
		String as2 = new String("Stats");	
		
		System.out.println("chk add " + as1==as2); 
		
// It'll chk for reference hence FALSE bcz as1 has got obj created
// in HEAP as well as StingConstantPool but as2 got created in HEAP only it chk in StringPool but found
// that "stats" already present there so now both are pointing to different objects in different memory 
//area HENCE FLSE
		System.out.println(as1.equals(as2) + "chk content"); // TRUE bcz it'll compare on Content present inside
		
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating string with new keyword    
		System.out.println(s1);    
		System.out.println("s2 " + s2);    
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
