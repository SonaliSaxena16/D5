package programPractice;

public class CopyEleFromOneArrayToOther {

	public static void main(String[] args) {

		//Program to copy all elements of one array into another array

		int[] x1 = {1,2,3,4,5};// Initialize array    
		System.out.println(x1);
		System.out.println(x1.length);
		int[] x2 = new int[x1.length];//create a same size 2nd array

		for(int i = 0; i<=x1.length-1; i++){
		x2[i] = x1[i];//copy the array or swap the array
		System.out.print(x2[i]);
		}



		}
	}

