package thisKeword;

public class A {

	public void m() {
		System.out.println("hello m");
	}
	
	public void n() {
		System.out.println("hello n");
		this.m();
	}
	
	
}
