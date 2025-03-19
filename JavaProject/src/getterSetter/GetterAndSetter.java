package getterSetter;

public class GetterAndSetter {
	
	private String name;
	

		public  void setName(String S) {
			this.name=S;
		}
		
		public String getName() {
			return name;
			
		}
		
		public static void main(String[] args) {
			GetterAndSetter obj = new GetterAndSetter();
			obj.setName("Sonali");
			System.out.println(obj.getName());
		}
		
}
