package stringConcept;

public class StringBuilderBasics {

	
//	StringBuilder class provides append()(append means to add something in the end of the Original word) method to perform concatenation operation. 
//The append() method accepts arguments of different types like Objects, StringBuilder, int, char, 
//CharSequence, boolean, float, double. StringBuilder is the most popular and fastest way to concatenate String
//It is mutable class which means values stored in StringBuilder objects can be updated

	public static void main(String args[])  
    {  
        StringBuilder s1 = new StringBuilder("Hello");    //String 1  
        StringBuilder s2 = new StringBuilder(" World");    //String 2  
        StringBuilder s = s1.append(s2);   //String 3 to store the result  
        System.out.println(s);  //Displays result  
      
        
// Converts the value from other Data Type to String. Take wrapper class while converting a DataType to String
        
        int a = 10;
        System.out.println(Integer.toString(a));
    }  

}
