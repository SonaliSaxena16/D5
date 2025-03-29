package practiceWithVaibhavSir;

public class CountNoOfEleInArray {

	public static void main(String[] args) {
		
		int count=0;
		
		int num[] = {1,2,3,4,5};
		
		for(int i=0; i<num.length; i=i+1) {
			count++;
		}
		
		System.out.println("Count is : " + count);
	}

}
