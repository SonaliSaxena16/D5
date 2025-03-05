package practiceWithVaibhavSir;

public class ReverseOfAnInteger {

	public static void main(String[] args) {

		int oriNum=5491, copyNum, saveRem , var=0;
		copyNum=oriNum;
		
		while(copyNum>0) {
			saveRem=copyNum%10; // It'll give remainder
			copyNum=copyNum/10; // It'll give number, by removing the last digit as 54 it'll give
			var=saveRem;
			System.out.print(var);
		}
	}
}
