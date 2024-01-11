package practiceInterviewQue;

public class Replace3rdOccurence {

	public static void main(String[] args) {
		        
		     String s = "Good Morning, Good Afternoon, Good Evening, Good Night";
				
				String s1[] = s.split(",");
			
			// System.out.println(s1[0]);
			
			String s2[] = s1[2].split(" ");
			
			String s3 = s2[1].replace("Good", "Best");
			
//		 	 System.out.println(s3);
			 
		 	String s4 = s1[0] + s1[1] + " " + s3 + " " + s2[2] + s1[3];

		    System.out.println(s4);
		    }}
	
	
	
	
	
	
	
	