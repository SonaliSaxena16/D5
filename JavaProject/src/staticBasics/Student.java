package staticBasics;

public class Student {

	
		int rollNo=1;
		String stuName="Sonali";
		static String collegeName = "IGNOU";
		
		public void displayInfo(){
		System.out.println("name" + " "+ stuName + " "+ "rollNo" + " "+ rollNo + " "+ "collegeName" +" "+ collegeName);
		} 
		
		public static void main(String[] args) {
			
			Student obj1 = new Student();	
			obj1.displayInfo();						
		}
	}