
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an ordered array of Person objects
		int maxSize = 10;             // array size
		ClassDataArray orderedArray;            // reference to array
		orderedArray = new ClassDataArray(maxSize);  // create the array

		
		
		// insert 10 items
		orderedArray.insert("Evans", "Patty", 24);
		orderedArray.insert(new Person("Smith", "Lorraine", 37));
		orderedArray.insert("Yee", "Tom", 43);
		orderedArray.insert("Adams", "Henry", 63);
		orderedArray.insert("Hashimoto", "Sato", 21);
		orderedArray.insert("Stimson", "Henry", 29);
		orderedArray.insert("Velasquez", "Jose", 72);
		orderedArray.insert("Lamarque", "Henry", 54);
		orderedArray.insert("Vang", "Minh", 22);
		orderedArray.insert("Creswell", "Lucinda", 18);
		
		orderedArray.displayA();                // display items
		
		String searchKey = "Stimson";  // search for item
		Person found;
	}

}
