package staticBasics;

public class StudentWithconstructor {
	int rollNo;
	String stuName;
	static String collegeName = "IGNOU";
	
	StudentWithconstructor(int rollNo, String stuName) {
	this.rollNo=rollNo;
	this.stuName=stuName;
	}
	
	public void displayInfo() {
System.out.println("name" + " "+ stuName + " "+ "rollNo" + " "+ rollNo + " "+ "collegeName" +" "+ collegeName);
	}
	
	static void changeCollegeName() {
		collegeName = "LPU";
	}
	
	
	public static void main(String[] args) {
		
		StudentWithconstructor s = new 	StudentWithconstructor(10,"Sakshi");
		StudentWithconstructor s1 = new 	StudentWithconstructor(12,"Sonam");
		s.displayInfo();
		s1.displayInfo();
		changeCollegeName();
		s.displayInfo();
	}
	
	
	
}
