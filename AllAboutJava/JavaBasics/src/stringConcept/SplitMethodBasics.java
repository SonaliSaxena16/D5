package stringConcept;

import java.util.Arrays;

public class SplitMethodBasics {

	public static void main(String[] args) {
		
		// Split() always returns an ARRAY of String[]
		
		String text = "Hello, My name is, Sachin";  
        /* Splits the sentence by the delimeter passed as an argument */  
         String[] sentences = text.split(",");  
      //  System.out.println(Arrays.toString(sentences));  // It'll print in a single line
        
        
        // If you want output seperately/ vetically use loop
        String st = new String("Hello, My name is, Sonali");
//        for(String splitted : st.split(",")) {
//        	System.out.println(splitted);
//        }
        
        String[] sen = text.split(",");  
        for(int i=0; i<sen.length; i++) {
        	System.out.println(sen[i]);
        }
	}

}
