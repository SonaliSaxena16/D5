package practiceWithVaibhavSir;

public class CountTheIndexWithOccurenceInString {

	public static void main(String args[]) {

		char ch[] = {'s','s','o','o','n','n','a','a','l','l','i','i','s'};

		int count=1;

		for(int i=0; i<ch.length; i++) {

			for(int j=i+1; j<=ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					count++;
				}

			}

		}
	}
}
