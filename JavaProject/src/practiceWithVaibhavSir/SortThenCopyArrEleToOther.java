package practiceWithVaibhavSir;

import java.util.Arrays;

public class SortThenCopyArrEleToOther {

	public static void main(String[] args) {

		int temp=0;
		int sortedArr[];
		
		int origArr[] = {9,5,1,8,9,3,0,2};
		int copyArr[] = new int[8];
		
		for(int i=0; i<origArr.length; i=i+1) {
			
			for(int j=i+1; j<origArr.length; j=j+1) {
			
				if(origArr[i]>origArr[j]) {
					temp=origArr[i];
					origArr[i]=origArr[j];
					origArr[j]=temp;
				}
			}
		//	System.out.print(origArr[i]);
		}
		
		sortedArr=origArr;
		System.out.println(Arrays.toString(sortedArr));
		
		// [0, 1, 2, 3, 5, 8, 9, 9]
		
		for(int i=sortedArr.length-1; i>=0; i=i-1) {
			copyArr=sortedArr;
		//	System.out.print(copyArr[i]); // This shows reversed output as I wanted
		}
		
	//	System.out.print(Arrays.toString(copyArr)); // but this doesn't display reversed output why ?
	}

}
