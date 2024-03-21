package interviewQue;

public class TestSchool implements SchoolInterface , SchInterface{

	
	public void come() {
		
	}
	
	public static void main(String[] args) {

		SchoolInterface s = new TestSchool();
		s.exam();
		System.out.println("Hi");
	}

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
	}

	@Override
	public void air() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
