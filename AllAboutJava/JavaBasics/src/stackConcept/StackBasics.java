package stackConcept;

public class StackBasics {

	
	int size;
	int arr[];
	int top;
	
	StackBasics(int size){
	this.size = size;
	this.arr = new int[size];
	this.top = -1;
	}
	
	// time complexity : 0(1)
	public void push(int element) {
		if(!this.isFull()) {
			top++;
			arr[top]= element;
			System.out.println("element pushed" + element);
		}
		
		else{
			System.out.println("Stack is full now");
		}
	}
	
	
	
		public int pop() {
			if(!this.isEmpty()) {
				int returnedTop = top;
				top--;
				System.out.println("Popped element" + arr[returnedTop]);
				return arr[returnedTop];
			}
			
			else {
				System.out.println("Stack is empty");
				return -1;
			}
		
	}
		
		
		
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}
		
		else {
			System.out.println("Stack is empty");
		}
		return -1;
	
	}
	
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	
	public boolean isFull() {
		return (size-1 == top);
	}
	
	
	public static void main(String[] args) {

		StackBasics stackBase = new StackBasics(10);
		stackBase.pop();
		
		System.out.println("...................");		
		
		stackBase.push(100);
		stackBase.push(200);
		stackBase.push(300);
		stackBase.push(400);
		 
		System.out.println("....................");
	System.out.println(stackBase.peek());	
	
		stackBase.pop();
		stackBase.pop();
		stackBase.pop();
		
		System.out.println(stackBase.isEmpty());	
		System.out.println(stackBase.isFull());	

		
		
	}

}
