
public class SelectionSortMe {

	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,13,9,15,4,7,3,17,12,5,16,2};
//		int[] myArray = {17,16,15,13,12,9,7,6,5,4,3,2};
		System.out.println("original array");
		PrintArray(myArray);
		
		int comparisons = 0;
		int swaps = 0;
		
		// loop through, compare first element to all elements
		// swap with the lowest element
		for (int i = 0; i < myArray.length - 1; i++) {

			int lowIndex = i;
			System.out.println(String.format("low value: %d at index: %d", myArray[lowIndex], lowIndex));
			
			for (int j = i + 1; j < myArray.length; j++) {
				
				comparisons++;
				
				// if the next value in the array is lower than the current lowest number,
				// then set low to be that array value
				if (myArray[j] < myArray[lowIndex]) {
					
					lowIndex = j;
					System.out.println(String.format("low value: %d at index: %d", myArray[lowIndex], lowIndex));
				} // if
			} // inner
			
			if (lowIndex != i) {
				
				System.out.println(String.format("swapping %d at index %d with %d at index %d\n",
						myArray[i], i, myArray[lowIndex], lowIndex));
				int temp = myArray[i];
				myArray[i] = myArray[lowIndex];
				myArray[lowIndex] = temp;
				swaps++;
			} // if
			else {
				
				System.out.println("no swap made\n");
			} // else
			
			PrintArray(myArray);
		} // outer
		
		System.out.println(String.format("%d comparisons\t%d swaps", comparisons, swaps));
	} // main

}
