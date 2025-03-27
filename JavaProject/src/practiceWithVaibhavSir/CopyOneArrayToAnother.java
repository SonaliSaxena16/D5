package practiceWithVaibhavSir;

import java.util.Arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {

		int origArr[] = {1,2,3,4,5};
		int copyArr[] = new int[5];
		
		
//		System.out.println(origArr.length);
//		System.out.println(copyArr.length);
		
		
		for(int i=0; i<origArr.length; i++) {
			copyArr[i] = origArr[i];
		//	System.out.print(copyArr[i]);  2 ways to print aaray either use this Print statement or the one written outside loop as Java's default behavior is we cant directly print value of Arrays its not in human readable format. Either we've to print each number coming in LOOP else once loop finishes we've all the elements inside the copyArr now we can use toString() of Arrays class in order to convert Arrays default value to String so that it can be readable.
			
		}
		System.out.println(Arrays.toString(copyArr));
		System.out.print(Arrays.toString(origArr));
	}

}
