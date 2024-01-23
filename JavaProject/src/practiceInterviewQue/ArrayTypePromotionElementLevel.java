package practiceInterviewQue;

public class ArrayTypePromotionElementLevel {

	public static void main(String[] args) {

		int[] i = {1,2};
		
		char ch[] = {'a','b'};
		
		int j[] = i;
		
		System.out.println(j[1]);// Till here program is okay
		
//	int s[] = ch; // Invalid assignment as only Object type Parent Array can be converted to child array of other data type
		
		
	}

}
