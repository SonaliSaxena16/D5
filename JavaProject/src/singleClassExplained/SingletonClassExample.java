package singleClassExplained;

public class SingletonClassExample {

	static SingletonClassExample obj = new SingletonClassExample();
	
	private SingletonClassExample() {
		
	}
	
	public static SingletonClassExample getObject() {
		
		return obj;
	}
}
