package StaticAndInstanceBlock;

public class InstanceControlFlowProgram {


	//Implementation of Instance Control Flow.

	/*	THIS WHOLE PROCESS EXECUTION STARTS FROM TOP AND ENDS AT BOTTOM.
	 * 1) Identification of instance members (variables, blocks, methods).
	 * 2) Instance Blocks execution and Instance Variables assignment of user-defined values.
	 * 3) Execution of Constructor.
	 */

		
		//First Instance Variable 
		int intVariableOne = 5;				//First Step :
											//intVariableOne = 0 (Read Indirectly Write Only [RIWO]) 
											
			// Instance method						//Second Step :
		void methodExampleTwo() {
			System.out.println("Method 2-- 2nd line to be printed");
		}
		
		// Instance Blok - Calling of Instance Method
		{
			this.methodExampleTwo();
			
			System.out.println("Method 2 - 3rd line to be printed");
		}
		
		//First Instance Block
		{
			this.methodExampleOne();
			
			System.out.println("Inside First Instance Block.");
		}
		
		//Constructor
		InstanceControlFlowProgram(){
			System.out.println("Inside Constructor.");
			System.out.println("Value of First Instance Variable : " +this.intVariableOne);
		}
		
		

		//Main Method
		public static void main(String[] args) {	
			System.out.println("1st line to be pritned");
			InstanceControlFlowProgram obj = new InstanceControlFlowProgram();
			System.out.println("Main method");
			obj.methodExampleOne();
			obj.methodExampleTwo();
		}
		
		//Instance Method
		void methodExampleOne() {
			System.out.println("Method 1 ---Value of Second Instance Variable : " +this.intVariableTwo);
		}
		
		
		//Second Instance Variable
		int intVariableTwo = 10;				//First Step :
												//intVariableTwo = 0 (Read Indirectly Write Only [RIWO]) 
		
												//Second Step :
												//intVariableTwo = 10 (Read & Write [R&W])
		
		//Second Instance Block
		{
			System.out.println("Inside Second Instance Block.");
		}
		
		

		 
	}



// Value of Second Instance Variable : 0
// Inside First Instance Block.
//Inside Second Instance Block.
//Value of Second Instance Variable : 10 -----
//Inside Constructor.
//Value of First Instance Variable : 5
//Value of Second Instance Variable : 10


