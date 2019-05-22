
public class NewSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] myArray = {6,4,9,2,7,5};
//		int[] myArray = {3,7,2,5,1,7,7,8,6,9,4,0};
		int[] myArray = {6,13,9,15,4,7,3,17,12,5,16,2};
		System.out.println("starting array...");
		PrintArray(myArray);
		System.out.println();
//		selectionSort(myArray);
//		insertionSort(myArray);
		insertionSortChaz(myArray);
		System.out.println("complete...");
		PrintArray(myArray);

	}

	private static void insertionSort(int[] myArray) {
		
		
		for (int i = 1; i < myArray.length; i++) {
			
			int j = i;
			int num = myArray[i];
			
			System.out.printf("comparing %d at index %d with %d at index %d\n",
					num, i, myArray[j - 1], j - 1);
			
			while (j > 0 && myArray[j - 1] >= num) {
				
				System.out.printf("moving %d from index %d to index %d\n", myArray[j - 1], j - 1, j);
				myArray[j] = myArray[j - 1];
				j--;
			}
			
			if(j != i) {
				
				System.out.printf("inserting %d at index %d\n", num, j);
				myArray[j] = num;
			}
			else {
				
				System.out.println("no moves made");
			}
			
			PrintArray(myArray);
			System.out.println();
		}
	}
	
	private static void insertionSortChaz(int[] myArray) {
		
		for (int j = 0; j < myArray.length - 1; j++) {
			
			int lowest = myArray[j];
			int lowestIndex = j;
			System.out.printf("lowest number is %d at index %d\n", lowest, lowestIndex);
			
			for (int i = j + 1; i < myArray.length; i++) {
				
				if (myArray[i] < lowest) {
					lowest = myArray[i];
					lowestIndex = i;
					System.out.printf("new lowest number is %d at index %d\n", lowest, lowestIndex);
				}
			} // end i
			
			for (int k = lowestIndex; k > j; k--) {
				
				System.out.printf("shifting %d at index %d to index %d\n", myArray[k - 1], k - 1, k);
				myArray[k] = myArray[k - 1];
			} // end k
			
			if (j == lowestIndex) {
				
				System.out.printf("number %d is already sorted at index %d - no moves made\n\n", lowest, j);
			}
			else {

				System.out.printf("inserting %d at index %d\n\n", lowest, j);
				myArray[j] = lowest;
			}
			PrintArray(myArray);
			System.out.println();
			
		} // end j
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
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}

}
