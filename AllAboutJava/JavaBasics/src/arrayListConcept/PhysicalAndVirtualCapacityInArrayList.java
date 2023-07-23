package arrayListConcept;

import java.util.ArrayList;

public class PhysicalAndVirtualCapacityInArrayList {

	public static void main (String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		// Till here as no value in Arraylist the VirtualCap is 10 & physicalCap is 0
		ar.add(100);
		// Now I've added 1 value of 100 the VirtualCap is 9 & physicalCap is 1
		System.out.println(ar.size()+"size1stTime");

		ar.add(200);
		ar.add(300);
		ar.add(400);
		// Now I've added 3 more values of 100,200,300 the VirtualCap is 6 & physicalCap is 4
		System.out.println(ar.size()+"size2ndTime");
		
// NOTE ** It's a vice-versa process as soon as VirtualCap reduces & physicalCap gets increases
		// Now you can customize your  VirtualCap as well by defining the size in the constructor
		
		ArrayList<Object> aro = new ArrayList<Object>(20);	
		
	}
}
