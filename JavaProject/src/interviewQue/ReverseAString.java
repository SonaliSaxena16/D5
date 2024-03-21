package interviewQue;

public class ReverseAString {

	public static void main(String[] args) {

		        String str = "I AM SONALI";
		        
		        String rev = "";
		        
		        char ch;
		        
		        for(int i=0; i<str.length(); i++){
		            
		             ch = str.charAt(i);
//		                System.out.println(ch); This'll print single character at i() index everytime when i=0 it'll print M , i=1 it'll print a 

		        rev = ch+rev; // rev variable will help to concatenate the String
		            
	             //   System.out.println(rev); This'll print star pattern as per index whatever value it'll have in (i), it'll start print and club the value 1st at oth index then 0,1 then 0,1,2 index
	            
		        }
		                System.out.println(rev); // This'll simply print reverse vedahaM
		
		
		
	}

}
