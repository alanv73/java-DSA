
public class BubbleSortOptimized {

	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,3,9,4,7,5};
		// keep track of number of passes
		int numberOfPasses = 0;
		int numComparisons = 0;
		int swaps = 0;
		
		System.out.println("Original array");
		BubbleSortOptimized.PrintArray(myArray);
		
		// change the outer LCV so that we are making one fewer comparison
		// for each pass through the array
		for (int i = myArray.length - 1; i > 0; i--) {
			
			for( int j = 0; j < i; j++) {
				//compare current element to next highest
				
				// if lower element is greater than the higher element
				if (myArray[j] > myArray[j + 1]) {
					// swap
					swaps++;
					// (hold onto element so we don't lose it)
					int temp = myArray[j + 1];
					// assign lower element
					myArray[j + 1] = myArray[j]; // at this point both array elements hold the same value
					// assign higher element
					myArray[j] = temp;
				} // end if
				numComparisons++;
			} // end j loop
			numberOfPasses++;
			System.out.println(String.format("Pass number: %d\tNumber of Comparisons: %d\tNumber of Swaps: %d",
					numberOfPasses, numComparisons, swaps));
			BubbleSortOptimized.PrintArray(myArray);
		} // end i loop
		

	} // end main

} // end class
