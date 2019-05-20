
public class IntArray {

	public static int[] Reverse(int[] intArray) {
		
		int[] newArray = new int[intArray.length];
		int j = 0;
		
		for (int i = intArray.length - 1; i >= 0; i--) {
			newArray[j] = intArray[i];
			j++;
		}
		
		return newArray;
	}
	
	// version we went over in class
	public static int[] ReverseChaz(int[] intArray) {
		
		
		int[] arrayReversed = new int[intArray.length];
		
		for (int i = 0, j = arrayReversed.length - 1; i < arrayReversed.length; i++, j--) {
			arrayReversed[i] = intArray[j];
		}
		
		return arrayReversed;
	}
	
	public static int[] Remove(int[] intArray, int value) {
		
		int newArray[] = new int[intArray.length];
		int j = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] != value) {
				newArray[j] = intArray[i];
				j++;
			}
		}
		
		return newArray;
	}
	
	// version we went over in class
	public static int[] RemoveChaz(int[] originalArray, int value) {
		
		boolean found = false;
		
		int[] arrayRemoved = new int[originalArray.length - 1];
		
		// loop through original array
		for (int i = 0, j = 0; i < originalArray.length; i++) {
			
			// test for finding
			if (originalArray[i] == value) {
				
				System.out.println(String.format("i is %s", i));
				System.out.println(String.format("j is %s", j));
				found = true; // set flag but don't populate new array
			}
			else {
				
				arrayRemoved[j] = originalArray[i];
				j++;
			}
		}
		
		// if found return new array, else return original array
		if (found == true) {
			return arrayRemoved;
		}
		else {
			return originalArray; // not found
		}
	}
	
	public static void PrintArray(int[] Array) {
		
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myNumbers = new int[5];
		int[] myEmptyArray;
		
		myNumbers[0] = 2;
		myNumbers[1] = 4;
		myNumbers[2] = 6;
		myNumbers[3] = 8;
		myNumbers[4] = 10;

		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);

		System.out.println();
		myEmptyArray = IntArray.Reverse(myNumbers);
		
		System.out.println("Reversed Array");
		IntArray.PrintArray(myEmptyArray);
		
		System.out.println();
		int numberToRemove = 6;
		
		myEmptyArray = IntArray.Remove(myNumbers, numberToRemove);

		System.out.println("Copy of Array with " + numberToRemove + " Removed");
		IntArray.PrintArray(myEmptyArray);
	
		System.out.println();
		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);
	}
	
}
