package stringConcept;

public class EqualsMethod {

		public static void main(String[] args) {
			
			String str1 = "hello";
			String str2 = "hello";
			String str3 = new String("hello");

			// Using .equals() to compare content of strings
			boolean result1 = str1.equals(str2);  // true, because their contents are the same
			boolean result2 = str1.equals(str3);  // true, even though str3 is a different object but content is same
			

			System.out.println(result1);  // Outputs true
			System.out.println(result2);  // Outputs true
	}

}
