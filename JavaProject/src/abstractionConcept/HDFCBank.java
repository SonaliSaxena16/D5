package abstractionConcept;

public  class HDFCBank extends Bank{

	@Override
	public void loan() {//This method overridded from Bank(Parent class)as Method name and parametr same 
	//but implementation is different
		System.out.println("HDFC loan method");
	}
	
	public void credit(){
		System.out.println("HDFC credit");
	}
	
	public void funds(){
		System.out.println("HDFC funds");
	}

	

}
