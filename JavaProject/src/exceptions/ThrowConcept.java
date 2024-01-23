package exceptions;

public class ThrowConcept {

	public static void main(String[] args) throws Exception {
		System.out.println("ABC");
		
		try {
			throw new Exception("Naveen Exception");
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("My own exception worked");
		
		
//	from line 8 to 14 if you remove and directly write line 18 then ine 20 isn't allowed wdout try/catch
		throw new Exception("Naveen Exception");
	//	System.out.println("My own exception worked"); // Not allowed to write any line after exception wdout try/catch block

	}

}
