package practiceWithVaibhavSir;

public class FindTheOccurrenceOfEachChar {

	public static void main(String[] args) {

		char ch[] = {'s','s','o','o','n','n','a','a','l','l','i','i'};
		int count=1;
		
		for(int i=0; i<ch.length; i++) {
			
			if(i<ch.length-1 && ch[i]==ch[i+1]) {
				count++;
			}
			
			else {
				System.out.println(ch[i] +"-"+ count);
				count=1;
			}
		}
	}
}