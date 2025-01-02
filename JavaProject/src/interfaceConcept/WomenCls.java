package interfaceConcept;

public class WomenCls extends MenCls implements HumanIntrfc,GirlIntrfc,BoyIntrfc {
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wakeup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runner() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		WomenCls w = new WomenCls();
//		System.out.println(w.eyes); Both Interfaces HumanIntrfc & GirlLntrfc have common Var eye but initialized with different values once child class cimplements these 2 different Interface and try to call Var eyes here compiler wud throw error as var is Ambigious. 
	}

	

}
