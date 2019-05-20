
public class SortingClient {
	
	public static void PrintArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void InsertionSort(int[] array) {
	
		for (int i = 1; i < array.length;i++) {
			
			int j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				int currentNumber = array[j];
				array[j] = array[j - 1];
				array[j - 1] = currentNumber;
				j--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		// create an ordered array of Person objects
		int maxSize = 100;             // array size
		ClassDataArray orderedArray;            // reference to array
		orderedArray = new ClassDataArray(maxSize);  // create the array
		
		// insert 7/11 items
		orderedArray.insertUnordered("Evans", "Patty", 24);
		orderedArray.insertUnordered(new Person("Smith", "Lorraine", 37));
		orderedArray.insertUnordered("Yee", "Tom", 43);
		orderedArray.insertUnordered("Adams", "Henry", 63);
		orderedArray.insertUnordered("Hashimoto", "Sato", 21);
		orderedArray.insertUnordered("Stimson", "Henry", 29);
		orderedArray.insertUnordered(new Person("Velasquez", "Jose", 72));
		orderedArray.insertUnordered("Lamarque", "Henry", 54);
		orderedArray.insertUnordered("Vang", "Minh", 22);
		orderedArray.insertUnordered("Creswell", "Lucinda", 18);
		orderedArray.insertUnordered(new Person("Gump", "Forest", 75));
		
		orderedArray.displayA();                // display items
		
//		orderedArray.bubbleSort();
//		orderedArray.selectionSort();
		orderedArray.insertionSort();
		
		orderedArray.displayA();                // display items
		
		System.out.println();
		
		int[] myArray = {6,13,9,15,4,7,3,17,12,5,16,2};
		
		PrintArray(myArray);
		
		InsertionSort(myArray);
		
		PrintArray(myArray);
		
		
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
