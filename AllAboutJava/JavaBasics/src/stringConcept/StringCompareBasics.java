package stringConcept;

public class StringCompareBasics {

	public static void main(String[] args) {

	// equals() - Compares original content of the string. It compares values of string for equality. 
	//	By Using == Operator - 
	//	By compareTo() Method
		
		String s1="Sachin";  
		 String s="sachin"; 
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println(s1.equals(s));//false  
		   System.out.println(s1.equalsIgnoreCase(s));//true
		   
		   System.out.println("....................");
		   
// equals() returns true if String objects are matching and both strings are of same case. equalsIgnoreCase() returns true regardless of cases of strings.
		
		   String sa="Sachin";  
		   String sb="Sachin";  
		   String sc=new String("Sachin");  
		   System.out.println(sa==sb);//true (because both refer to same instance)  
		   System.out.println(sa==sc);//false(because sc refers to instance created in nonpool)  
		
		   System.out.println("....................");

		   
// compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
// Suppose s1 and s2 are two String objects. If - 
// s1 == s2 : The method returns 0.
// s1 > s2 : The method returns a positive value.
// s1 < s2 : The method returns a negative value.		   
		   
		   String s11="hello";  
		   String s22="hello";  
		   String s33="meklo";  
		   String s44="hemlo";  
		   String s55="flag";  
		   System.out.println(s11.compareTo(s22));//0 because both are equal  
		   System.out.println(s11.compareTo(s33));//-5 because "h" is 5 times lower than "m"  
		   System.out.println(s11.compareTo(s44));//-1 because "l" is 1 times lower than "m"  
		   System.out.println(s11.compareTo(s55));//2 because "h" is 2 times greater than "f"   
	}

}     
