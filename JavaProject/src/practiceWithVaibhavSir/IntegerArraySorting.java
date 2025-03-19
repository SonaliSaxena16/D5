package practiceWithVaibhavSir;

public class IntegerArraySorting {

	public static void main(String[] args) {

		int num[] = {12,9,3,47,5,0,1};
		
		int temp=0;
		
		for(int i=0; i<num.length; i=i+1) {
			
			for(int j=i+1; j<num.length; j=j+1) {
				
			//	int num[] = {12,9,3,47,5,0,1};   9,12,3,47,5,0,1
											//	 i,j	
				
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
			System.out.print(num[i] + " ");

		}
		
	}

}
