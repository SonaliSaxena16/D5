package wrapper;

public class WrapperClassConcept {
	
	//data conversion - from String to Integer class
	//For every data type we've different wrapper classes - Integer, Double, Boolean
	// We don't have String to Character parsing method in java
	
	public static void main(String[] args) {
		
		String zl = "2";
		byte bb = Byte.parseByte(zl);
		System.out.println("byte "+zl);
		
		//No Method available for short in Java
		
		String x = "100";
		System.out.println(x+20); // it'll give 10020 in console
		System.out.println(1+1+x+1); //21001
		//String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20); // // it'll give 120 in console
		
		//String to impure integer(means int+string)
				String m = "100";
				int r = Integer.parseInt(m);
				System.out.println(r); //it'll give u NumberFormatException as it has to be proper int value
			
				//String to Long
				String vx = "08";
				long l = Long.parseLong(vx);
				System.out.println("long "+l);
				
				//String to float
				String v = "80";
				float f = Float.parseFloat(v);
				System.out.println("float "+v);
				
		//String to double
	String y = "12.33";
	double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		//Not Method available for short in Java
		
	}
	
}
