
public class NewSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,4,9,2,7,5};
		PrintArray(myArray);
		selectionSort(myArray);

	}

	private static void selectionSort(int[] myArray) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < myArray.length - 1; i++) {
			
			int lowestValue = myArray[i]; // grab first value of the comparison group
			int lowestIndex = i;
			System.out.println("Outer loop first value (myArray[" + i + "]): " + myArray[i]);
			
			// check each successive value to the next
			for (int j = i + 1; j < myArray.length; j++) {
				
				System.out.println("\t-Inner loop value (myArray[" + j + "]): " + myArray[j]);
				
				// if element at myArray[j] is smaller, swap my element at myArray[i]
				if (myArray[j] < lowestValue) {
					
					lowestValue = myArray[j]; // hold current value
					lowestIndex = j; // hold current index
				} // end if

			} // end j
			
			System.out.println("\t\t-lowest number of group is " + lowestValue);
			
			// swap if necessary
			// if lowestValue is on the left
			if (lowestValue == myArray[i]) {
				System.out.println("\t\t-lowest value is on the left; no swap occurred");
			}
			else {
				// if the lowest value is one of the 'j' values
				// swap
				int temp = myArray[i];
				myArray[i] = lowestValue;
				myArray[lowestIndex] = temp;
			}
			
			// after comparisons and potential swap
			System.out.println("After comparisons:");
			PrintArray(myArray);
			System.out.println(); // separation
			
		} // end i
	}

	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
