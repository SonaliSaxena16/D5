package arrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<Object> ob = new ArrayList<Object>(); // Object type generic defined
		ob.add(100);
		ob.add("Sonali");
		ob.add('&');
		ob.add(6878586879l);
		System.out.println(ob.size());
		System.out.println(ob);
		
		ArrayList<String> st = new ArrayList<String>(); // String type generic defined
		st.add("Sonali");
		st.add("&");
		System.out.println(st.size());
		System.out.println(st);
		
		ArrayList<Double> d = new ArrayList<Double>(); // Double type generic defined
		d.add(12.99);
		System.out.println(d.size());
		System.out.println(d);
		
		
		
		
	}

}
