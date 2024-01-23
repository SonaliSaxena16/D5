package abstractionConcept;

public interface Car {
//Must have all abstract()
//No need to mention abstract keywrd, Creating Interface itself means all methods are absract in nature.
//No Method Body as all are by default ABSTRACT only declaration
//Implementation of declared() will be in child class
//Using INTERFACE, we can achieve 100% ABSTRACTION
//We cannot create obj of INTERFACE 
//Interface can have only & only STATIC & FINAL VARS
//No need to explicitly write FINAL & STATIC - By default vars wud be treated as FINAL & STATIC
	
	int wheels = 4;
	
	public void start();
	public void stop();
	public void refuel();
	
	public abstract void eat();




}


