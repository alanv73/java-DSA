import java.util.ArrayList;

public abstract class Animal {

	protected String name;
	
	public abstract void eat();
	public abstract void performBehavior();
	
	public static void PerformAnimalBehavior(ArrayList<Animal> animals) {
		// loop through all animals
				for(Animal a : animals) {
					a.performBehavior();
				}
	}
	
	// each animal does their own thing
	public static void OutputAnimalBehavior(ArrayList<Animal> animals) {
		
		// loop through all animals
		for(Animal a : animals) {
			// just dog functionality
			if(a instanceof Dog) {
				// a.bark() // must explicitly convert
				((Dog) a).bark();
			}
			else if(a instanceof Cat) {
				((Cat)a).meow();
			}
		}
	}
	
	
	// method that loops through and prints objects
	public static void PrintAnimals(ArrayList<Animal> animals) {
		
		for(Animal a : animals) {
			System.out.println("a is: " + a);
			a.eat(); // should be in a separate method
			
		}
	}
}
