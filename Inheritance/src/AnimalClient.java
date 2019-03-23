
public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a new animal object
		Cat myAnimal = new Cat(); // starts with legs
		myAnimal.setHasLegs(false); // now doesn't have legs
		myAnimal.setName("Geoff");
		
		System.out.println("Running AnimalClient.java");

		// Output myAnimal's data
		System.out.println("myAnimal.toString(): " + myAnimal.toString());
	}

}
