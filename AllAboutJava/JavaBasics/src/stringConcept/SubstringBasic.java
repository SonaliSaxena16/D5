package stringConcept;

public class SubstringBasic {
	
	
	public static void main(String args[]){    
		 String s="SachinTendulkar";    
		 System.out.println("Original String: " + s);  
		 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
		 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  

		 // Index starts from 0 and it'll goto lastIndex-1
	
	}
}
