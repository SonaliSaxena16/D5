package stringConcept;

public class StringConcatenationBasics {

	public static void main(String[] args) {

//1  String concatenation can be done by using + operator 
		
		String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		   
		   String st=50+30+"Sachin"+40+40;  // 80Sachin4040 bcz anything return before String like it's int so it'll perform int add operation and whtever you've return after String it'll simplly included it in String.
		   System.out.println(st);//80Sachin4040  
		
		// 2 & By concat() method
		   
		   String s1="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar     
		   
	}

}
