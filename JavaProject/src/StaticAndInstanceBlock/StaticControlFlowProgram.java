package StaticAndInstanceBlock;

//Implementation of Static Control Flow.

/*	THIS WHOLE PROCESS EXECUTION STARTS FROM TOP AND ENDS AT BOTTOM.
 * 1) Identification of static members (variables, blocks, methods).
 * 2) Static Blocks execution and Static Variables assignment of user-defined values.
 * 3) Execution of Main Method.
 */

class StaticControlFlowProgram {
	
	static int staticIntExampleOne = 24;	//First Step :
											//staticIntExampleOne = 0 (Read Indirectly Write Only [RIWO]) 
	
											//Second Step :
											//staticIntExampleOne = 24 (Read & Write [R&W])
	 
	//First Static Block
	static {
		System.out.println("Value of First Static Int Variable : " + StaticControlFlowProgram.staticIntExampleOne);		
		StaticControlFlowProgram.staticMethodExample();
		
		System.out.println("Inside First Static Block");		
	}
	
	//Main Method
	public static void main(String[] args) {
		StaticControlFlowProgram.staticMethodExample();
		System.out.println("Inside Main Method");				
	}
	
	//Static Method
	public static void staticMethodExample() {		
		System.out.println("Value of Second Static Int Variable : " + StaticControlFlowProgram.staticIntExampleTwo);
	}
 
	//Second Static Block
	static {
		System.out.println("Inside Second Static Block");
	} 
	
	static int staticIntExampleTwo = 44;	//First Step :
											//staticIntExampleTwo = 0 (Read Indirectly Write Only [RIWO]) 
	
											//Second Step :
											//staticIntExampleTwo = 44 (Read & Write [R&W])
}

