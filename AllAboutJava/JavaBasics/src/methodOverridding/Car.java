package methodOverridding;

public class Car extends Vehicle{

// Polymorphism - One type of Data used in Many Forms
	
//Method Overridding is Methods with same signature(which means same method name with same parameters) are
//created in Parent & child class but implementation comes from different class

//Just like in life, Children can inherit properties from Parent, however Parent can't inherit from 
	// childern. Same is the case for Parent and Child classes

//In the Test class, we can create Obj of the Parent class(Car) as well as Child class(BMW). 
	
//Overridding is an example of HAS-A Relationship of Inheritance
	
// Using child class Obj we can call Methods of child as well as Parent class. 
// -------------Till here it's called STATIC/EARLY BINDING/COMPILE-TIME Polymorphism--------------------------
	
// However using Parent class Obj one can call only Parent class method not child class. Bcz Parent's can't  
	
// have Child's prorpeties, whereas child can inherit properties from Parents.
	
// In Test class if Parent class wants to call common method b/w Parent and Child class, then child class
// Obj can be called by Parent Class Reference var. Ex- Car c=new BMW();
// However still Parent class won't be able to call exclusive method of child class like Car class obj 
// can't call BMWs refuel();
	
// This is also called UPCASTING -> Typecasting a Child Obj to a Parent Obj
	
//	-------------Till here it's called Upcasting/RUN-TIME/LATE BINDING/DYNAMIC Polymorphism--------------------------
	
// Ex- I've used Overridding in Selenium findElement/findElements, get(), navigate(); 
	
	
	public void start() {
		System.out.println("Car Starts");
	}
	
	public void stops() {
		System.out.println("Car Stops");
	}
	
	public void refuel() {
		System.out.println("Car Refuel");
	}
	
		}
