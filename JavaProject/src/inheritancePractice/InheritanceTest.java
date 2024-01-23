package inheritancePractice;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Animal a = new Animal(); // Parent Class can access only its method not child's
		a.animalEats();
		a.animalRuns();
		System.out.println("Animal class output");
		
		// But child class can access own as well as Parent's methods
		
		Dog d = new Dog();
		d.animalEats();
		d.animalRuns();
		d.dogEats();
		
		System.out.println("Animal and Dog class output");

		
		// As Dog is a Parent of BadyDog so Dog can't access BabyDog's method as its a child cls
		
		BabyDog bd = new BabyDog();
		
		bd.animalEats();
		bd.animalRuns();
		bd.dogEats();
		bd.babyDogEats();
		
		System.out.println("Animal Dog and BabyDog class output");

		Animal s = new Dog();
		
	}
}
