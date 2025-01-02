package hasARelatioshipWorking;

public class HasARelationCls2{
	
	public void evolve() {
		System.out.println("Am evolving");
	}

	public static void main(String[] args) {

		HasARelationCls1 obj = new HasARelationCls1();
		
		obj.think();
		obj.recreate();
		
	//------------ The above code depicts the working of HAS-A relationship	
		
		
	//	obj.evolve // Not allowed as obj created is of Cls1 & method is in Cls2
		
		HasARelationCls2 o = new HasARelationCls2();
		o.evolve();
		
	//	HasARelationCls1 on = new HasARelationCls2(); // Its an upcasting & wud only be supported only if I extend Cls1 then I can create cls1 obj using cls2 refrence and this wud be set as an example of Is-A relationship however here we're working on HAS-A relatioship.
		
		
	}

}
