package basicPrograms;

public class FinalizeConcept {

	public void finalize(){
		System.out.println("finalize method will be called automatically without calling by obj refence");
	}
	
	
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
System.gc();// Just b4 using garbage collector method, automattically finalize() will be called just to clean up the process 
	}

}
