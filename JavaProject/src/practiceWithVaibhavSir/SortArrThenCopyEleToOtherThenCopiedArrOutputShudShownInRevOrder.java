package practiceWithVaibhavSir;

import java.util.Arrays;

public class SortArrThenCopyEleToOtherThenCopiedArrOutputShudShownInRevOrder {

	public static void main(String[] args) {

		int temp=0;
		
		int origArr[] = {9,5,1,8,9,3,0,2};
		int copyArr[] = new int[origArr.length];
		
		for(int i=0; i<origArr.length; i=i+1) {
			
			for(int j=i+1; j<origArr.length; j=j+1) {
			
				if(origArr[i]>origArr[j]) {
					temp=origArr[i];
					origArr[i]=origArr[j];
					origArr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(origArr));
		
		// [0, 1, 2, 3, 5, 8, 9, 9]
		
		for(int i=0; i<origArr.length; i=i+1) {
			copyArr[i]=origArr[origArr.length-1-i];
			
		//	 System.out.print(" " + copyArr[i]); 
		}
		
		System.out.print(Arrays.toString(copyArr)); 
	}
}

/*
 * Explanation
 * 
 * Here's how the copying works:
 * 
 * The first element of copyArr (copyArr[0]) should be the last element of
 * origArr (origArr[7]).
 * 
 * The second element of copyArr (copyArr[1]) should be the second-to-last
 * element of origArr (origArr[6]).
 * 
 * To achieve this, we use a loop that iterates over the indices of origArr and calculates the corresponding index for copyArr using the formula:

matlab
Copy
Edit
copyArr[i] = origArr[origArr.length - 1 - i];
Where:

i is the current index in the loop (starting from 0).

origArr.length - 1 gives the index of the last element in origArr.

Subtracting i from origArr.length - 1 gives the corresponding index from the end of origArr.

Loop Execution:

When i = 0: copyArr[0] = origArr[7] → 9

When i = 1: copyArr[1] = origArr[6] → 9

When i = 2: copyArr[2] = origArr[5] → 8


 */