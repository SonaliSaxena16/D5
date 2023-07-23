package programPractice;

public class LoopConcept {
	
	
	// While and For Loop can be used to check Entry point is condition is matched then only these 2 loops will be executed
	// Only difference is when we want infinite result we can use while loop but without incement/decrement statement and for Loop is used for fixed number of results to be produced
	
	public static void main(String[] args) {
		
		// 1. while(keyword so starts with small letter) loop
	// Disadvantage : It'll generate infinite result, if increment/decrement statement not provided
		
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++; // If you comment this line, it'll print 0 infinite time and leads to memory outage
		}
		
		System.out.println("**********************");
		
	// 2. for Loop - first do initialization ; then checks condition if true ; third comes into body executes ; fourth increment/decrement ; as and when founds condition to be false break the loop and come out of it
		
		for(int j=0; j<=10; j++) { // This line will print from 0 to 10 bcz of <= operator
			
			// If you want to print from 0 to 9 you can remove = operator for(int j=0; j<10; j++)
			System.out.println(j);
		}
		
		System.out.println("**********************");
		
		// 3. Reverse number print
		
		for(int k=10; k>=-5; k--) {
		System.out.println(k);
			
	}
	
	
	}
	

}
