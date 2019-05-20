
public class Client {

	public static void main(String[] args) {
		
		// create an ordered array of Person objects
		int maxSize = 100;             // array size
		ClassDataArray orderedArray;            // reference to array
		orderedArray = new ClassDataArray(maxSize);  // create the array
		
		// insert 7/11 items
		orderedArray.insertBinary("Evans", "Patty", 24);
		orderedArray.insertBinary(new Person("Smith", "Lorraine", 37));
		orderedArray.insertBinary("Yee", "Tom", 43);
		orderedArray.insertBinary("Adams", "Henry", 63);
		orderedArray.insertBinary("Hashimoto", "Sato", 21);
//		orderedArray.insertBinary("Stimson", "Henry", 29);
		orderedArray.insertBinary(new Person("Velasquez", "Jose", 72));
//		orderedArray.insertBinary("Lamarque", "Henry", 54);
//		orderedArray.insertBinary("Vang", "Minh", 22);
//		orderedArray.insertBinary("Creswell", "Lucinda", 18);
		orderedArray.insertBinary(new Person("Gump", "Forest", 75));
		
		orderedArray.displayA();                // display items
//		System.out.println();
//		
//		String searchKey = "Adams";  // search for item
//		Person found;
//		
//		System.out.println("Finding " + searchKey + ".. ");
//		found = orderedArray.findBinarySearch(searchKey);
//
//		if (found != null) {
//			System.out.println("Success");
//			found.displayPerson();
//		}
//		else {
//			System.out.println("Not Found");
//		}
//		System.out.println();

//		System.out.print("Deleting Smith.. ");
//		System.out.println((orderedArray.delete("Smith") ? "Success" : "Failure"));
//
//		System.out.print("Deleting Yee.. ");
//		System.out.println((orderedArray.delete("Yee") ? "Success" : "Failure"));
//		
//		System.out.print("Deleting Creswell.. ");
//		System.out.println((orderedArray.delete("Creswell") ? "Success" : "Failure"));
//		
//		System.out.println();
//
//		System.out.println("Array Contents:");
//		orderedArray.displayA();
	}

}
