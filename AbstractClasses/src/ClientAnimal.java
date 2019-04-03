import java.util.ArrayList;

public class ClientAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList of Animal objects
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Cat()); // adding Cat to an Animal array list
		animals.add(new Dog()); // adding Dog to an Animal array list
		
		//Animal.PrintAnimals(animals);
		
		//Animal.OutputAnimalBehavior(animals);
		
		Animal.PerformAnimalBehavior(animals);
		
		
	}

	
	
}
