
public class BubbleSort {

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
		int numberOfPasses = 1;
		
		System.out.println("Original array");
		BubbleSort.PrintArray(myArray);
		
		// 
		for (int i = 0; i < myArray.length - 1; i++) {
			
			for( int j = 0; j < myArray.length - 1; j++) {
				//compare current element to next highest
				
				// if lower element is greater than the higher element
				if (myArray[j] < myArray[j + 1]) {
					// swap
					// (hold onto element so we don't lose it)
					int temp = myArray[j + 1];
					// assign lower element
					myArray[j + 1] = myArray[j]; // at this point both array elements hold the same value
					// assign higher element
					myArray[j] = temp;
				} // end if
			} // end j loop
			System.out.println("Pass number " + numberOfPasses);
			BubbleSort.PrintArray(myArray);
			numberOfPasses++;
		} // end i loop
		

	} // end main

} // end class
