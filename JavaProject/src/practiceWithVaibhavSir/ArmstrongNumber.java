package practiceWithVaibhavSir;

public class ArmstrongNumber {

	public static void main(String[] args) {


		int origNum=54883, copyNum=origNum, rem, digitCounter=0, num=copyNum;
		double sum=0;

		while(copyNum>0) {
			copyNum=copyNum/10;
			digitCounter++;
		}

		System.out.println("Total no. of digits are : " + digitCounter);

		while(num>0) {
			rem=num%10; // 4
			num=num/10; // 54883
			sum = Math.pow(rem, digitCounter)+sum; // (4 ki power 6 krege bcz total digits in no. are 6 means 4*4*4*4*4*4)
		}

		if(sum==origNum) {
			System.out.println("Armstrong number");
		}

		else {
			System.out.println("Not an Armstrong number");

		}
	}
}



