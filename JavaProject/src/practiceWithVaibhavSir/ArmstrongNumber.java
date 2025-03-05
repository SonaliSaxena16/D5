package practiceWithVaibhavSir;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int origNum=1634, armStrongNum=0, num=origNum, rem;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			armStrongNum = rem*rem*rem+armStrongNum;
		}
		
		if(origNum==armStrongNum) {
			System.out.println("Its an ASN");
		}
		
		else {
			System.out.println("Not an ASN");
		}
	}

}
