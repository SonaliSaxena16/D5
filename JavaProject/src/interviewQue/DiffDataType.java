package interviewQue;

public class DiffDataType {

	
	public int run(int a) {
		System.out.println("Enter int method");
		return a;

	}
	
	public double run(double a) {
		
		System.out.println("Enter double method");
		return a;
	}
	
	
	public static void main(String[] args) {
		DiffDataType d = new DiffDataType();
		d.run(1);
		d.run(9.0d);
		
		
	}

}
