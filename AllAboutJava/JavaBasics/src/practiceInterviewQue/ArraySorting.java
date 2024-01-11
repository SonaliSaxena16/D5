package practiceInterviewQue;

public class ArraySorting {

	public static void main(String[] args) {

		int a[] = {2,4,3,1,9,8,7,5,6};
		
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
		}
			
		System.out.println(a[i]);	
		}
		
		
		
		
	}

}
