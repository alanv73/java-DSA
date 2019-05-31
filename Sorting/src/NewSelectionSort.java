

public class NewSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] myArray = {6,4,9,2,7,5};
//		int[] myArray = {3,7,2,5,1,7,7,8,6,9,4,0};
		int[] myArray = {6,13,9,15,4,7,3,17,12,5,16,2};
		int[] myArray2 = {6,13,9,15,4,7,3,17,12,5,16,2};
//		int[] myArray = new int[12];
//
//		for(int j=0; j<12; j++)	{				// fill first group of arrays with
//		   int n = (int)( java.lang.Math.random()*(12-1) );
//		   myArray[j] = n;
//	    }
		
		System.out.println("starting arrays...");
		PrintArray(myArray);
		PrintArray(myArray2);
		System.out.println();
//		selectionSort(myArray);
		SelectionSortBreakIfSorted.selectionSort(myArray2);
		System.out.println();
//		insertionSort(myArray);
		insertionSort(myArray);
		System.out.println("completed arrays...");
		PrintArray(myArray);
		PrintArray(myArray2);

	}

	private static void insertionSort(int[] myArray) {
		
		int copies = 0;
		int comparisons = 0;
		
		for (int i = 1; i < myArray.length; i++) {
			
			int j = i;
			int num = myArray[i];
			
			System.out.printf("comparing %d at index %d with %d at index %d\n",
					num, i, myArray[j - 1], j - 1);
			
			while (j > 0 && myArray[j - 1] >= num) {
				
				comparisons++;
				System.out.printf("moving %d from index %d to index %d\n", myArray[j - 1], j - 1, j);
				myArray[j] = myArray[j - 1];
				copies++;
				j--;
			}
			
			if(j != i) {
				
				System.out.printf("inserting %d at index %d\n", num, j);
				myArray[j] = num;
			}
			else {
				
				System.out.println("no moves made");
				comparisons++;
			}
			
			PrintArray(myArray);
			System.out.println();
		}
		System.out.printf("%d copy operations performed\n", copies);
		System.out.printf("%d comparisons made\n", comparisons);
	}
	
	@SuppressWarnings({ "unused" })
	private static void insertionSortChaz(int[] myArray) {
		
		int copies = 0;
		int comparisons = 0;
		
		System.out.println("-Chaz's Insertion Sort");
		for (int j = 0; j < myArray.length - 1; j++) {
			
			int lowest = myArray[j];
			int lowestIndex = j;
			System.out.printf("lowest number is %d at index %d\n", lowest, lowestIndex);
			
			for (int i = j + 1; i < myArray.length; i++) {
				
				comparisons++;
				if (myArray[i] < lowest) {
					lowest = myArray[i];
					lowestIndex = i;
					System.out.printf("new lowest number is %d at index %d\n", lowest, lowestIndex);
				}
			} // end i
			
			for (int k = lowestIndex; k > j; k--) {
				
				System.out.printf("shifting %d at index %d to index %d\n", myArray[k - 1], k - 1, k);
				myArray[k] = myArray[k - 1];
				copies++;
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
		System.out.printf("%d copy operations performed\n", copies);
		System.out.printf("%d comparisons made\n", comparisons);
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
