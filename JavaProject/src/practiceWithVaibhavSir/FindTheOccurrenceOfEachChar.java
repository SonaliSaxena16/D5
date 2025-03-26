package practiceWithVaibhavSir;

public class FindTheOccurrenceOfEachChar {

	public static void main(String[] args) {

		String str = "ssonalis";
		char[] ch = str.toCharArray();
			System.out.println(ch);
			System.out.println("***********");

			int count=1;
			char temp = ' ';

			for(int i=0; i<ch.length; i=i+1) {
				for(int j=i+1; j<ch.length; j=j+1) {
					if(ch[i]>ch[j]){
						temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}

//			char[] sortedCharArray = ch;
			System.out.print(ch);
			System.out.println(";;;;;;;;;;;;;;;;;");
			// ch = a i l n o s s s s
	System.out.println("Length " + ch.length);

			for (int i = 0; i < ch.length; i=i+1) {
				if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
					count++;
				}
				else {
					System.out.println(ch[i] + "-" + count);
					count = 1;
				}
			}
}}