package programPractice;

public class PrintNum1to100NoLoopUseByRecursiveMethod {

 //No loop used
 //Use Recursive Function means it'll keep calling itself inside own function implement it using if condition
 //Java Streams
		
		//Program with hardcoded values
		public static void main(String[] args) {
			printNum(0);
		}
	//
		public static void printNum(int num) {
			if(num <= 100) {
				System.out.println(num);
				num++;
				printNum(num);
			}
		}
		
	//}

	//---------------------------------------------------------------

	//Program with series values not hardcoded

//		public static void main(String[] args) {
//			printNum(1, 100);
//		}
//
//		public static void printNum(int startNum, int endNum) {
//			if(startNum <= endNum) {
//				System.out.println(startNum);
//				startNum++;
//				printNum(startNum, endNum);	
//			}
//		}

}
