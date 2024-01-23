package StaticAndInstanceBlock;

public class UnderstandingBlock {

	static {
		// Static Block will execute first even b4 Main()
		// We can have n number of Static Blocks
// It can be written anywhere in the program but will be executed in the sequence as they were written. So output wud be Static Block 1,2,3,4
		System.out.println("Static Block1"); 

	}
	
	
	static {
		System.out.println("Static Block2"); 

	}
	
	static {
		System.out.println("Static Block3"); 

	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		
	}
	
	static {
		System.out.println("Static Block4"); 

	}

}
