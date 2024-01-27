package arrayConcept;

public class ArrayClass {

	public static void main(String[] args) {

		int i[] = new int[4];	// int Array
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]); // output 10
		System.out.println(i[1]); // 20
		System.out.println(i.length); // 4
		
		System.out.println("----------------------------");
		
		// To print all the values of ARRAY use FOR LOOP
		
		for(int j=0; j<i.length ; j++) {
			
			System.out.println(i[j]);
			
		}
		
		double d[] = new double[3];				// double Array
		d[0] = 34.67;
		d[1] = 12.33;
		d[2] = 78.90;
		
		System.out.println(d[2] + "double");
		
		char ch[] = new char[3];	// char Array
		ch[0] = 's';
		ch[1] = '4';
		ch[2] = '$';
		System.out.println(ch[2] + "char");
	
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1] + "boolean");
		
		String st[] = new String[4];
		st[0] = "Sonali";
		st[1] = "Tests";
		st[2] = "Pass";
		st[3] = "Selenium";
		System.out.println(st[3] + "String");
		System.out.println(st[1].length() + "StringLength");

		Object ob[] = new Object[6]; // Object Array is used to store different DataTypes as Object is the superClass above all DataTypes
		ob[0] = 22; // passing int
		ob[1] = 's'; // passing char
		ob[2] = "Set"; // passing String
		ob[3] = true; // passing boolean
		ob[4] = 9560975687l; // passing long
		ob[5] = 12.44; // passing float
		System.out.println(ob[4] + "Object");

		
		// ------------------------------------------------------------------------
		       int []x ; //Create
		       x = new int[2]; //Define
		       x[0] = 10; //Initialize array value at 0th position
		       x[1] = 5;  ////Initialize array value at 1st position
		    
		 String []z = {"sonali", "10"};
		 System.out.println(z[0].length() + " " + "String length");

		    // length;- Use to represent the size of array of primitive data type.
//		    length always start with number 1.
		    //and Array index will always start with number 0.
		    // length(); - use to represent number of character present in the string object.length() is final method.
		       

		// Array vaiable assignments -:
		 
		//1. Conversion primitive to primitive
		 
//		 char[] ch = {'a', 'b'};
//		 int []i = ch;	// Not possible for primitive datatypes 
//		   System.out.println(i);    // Type mismatch: cannot convert from char[] to int[]

		//2.
		   
		 String []s = {"A", "B"}; // Possible for non-primitive datatypes like string, obj & enum class
		 Object []a = s;
		 a[1] = "c";
		 System.out.println("String to obj-- " + s[0]+a[1]); // Output AC

		 a[0] = "d";
		 System.out.println("String to obj--------- " + s[0]+a[1]); // Output DC

		//3.
		int []p = {10,20,30,40};
		int []q = {100, 110};

		 System.out.println(p[0] +" " + "p0 is");
		 System.out.println(q[0] +" " + "q0 is");
		 p = q;
		// q = p;
	    // 100 = 100;
		  System.out.println(p[0] + "value of p0");
		  System.out.println(q[0] + "value of q0");
	//	System.out.println(q[0]);
		        
	   }
	}

