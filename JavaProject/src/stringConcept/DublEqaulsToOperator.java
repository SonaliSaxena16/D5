package stringConcept;

public class DublEqaulsToOperator {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");

		// Using == to compare references
		boolean result1 = str1 == str2;  // true, because they refer to the same instance in the string pool
		boolean result2 = str1 == str3;  // false, because str3 is a new object with a different memory address

		System.out.println(result1);  // Outputs true
		System.out.println(result2);  // Outputs false
	}
	
}
