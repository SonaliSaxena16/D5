package wrapper;

public class WrapperClassConcept {
	
	//data conversion - from String to Integer class
	//For every data type we've different wrapper classes - Integer, Double, Boolean
	// We don't have String to Character parsing method in java
	
	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20); // it'll give 10020 in console
		
		//String to int
		int i = Integer.parseInt(x);
System.out.println(i+20); // // it'll give 120 in console
		
		
		//String to double
	String y = "12.33";
	double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//String to impure integer(means int+string)
		String m = "100A";
		int r = Integer.parseInt(m);
		System.out.println(r); //it'll give u NumberFormatException as it has to be proper int value
		
	}
	
}
