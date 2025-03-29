package practiceWithVaibhavSir;

public class FindTheIndexOfChar {

	public static void main(String[] args) {

		
		        String s = "Sonalli";
		        char ch='l';
		        int count=0;
		        for(int i=0; i<s.length();i++){
		            if(ch==s.charAt(i))
		            {
		                System.out.println("Index"+ i);
		                count=count+1;
		            }
		        }
		        System.out.println("Count : " + count);
	}
}
