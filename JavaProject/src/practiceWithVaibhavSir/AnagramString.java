package practiceWithVaibhavSir;

public class AnagramString {

	public static void main(String[] args) {

		int count=1;
		
		String s1 = "python";
		char a[] = s1.toCharArray(); // l i s t e n
		
		String s2 = "typhon";
		char b[] = s2.toCharArray(); // s i l e n t
		
		for(int i=0; i<a.length; i=i+1) {
			
			count=1;
			
			for(int j=0; j<b.length; j=j+1) {
				
				if(a.length==b.length && a[i]==b[j]) {
				count+=1;
				}
			}
		}
		
		if(count==2) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

}
