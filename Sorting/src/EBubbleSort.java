
public class EBubbleSort {

	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,3,9,4,7,5};
		boolean ordered = true;
		
			EBubbleSort.PrintArray(myArray);
			
			// outer loop controls length of inner loop
			// inner loop passes get shorter by one each time through
			for (int j = myArray.length - 1; j > 0;j--) {
				
				// one pass through array
				for (int i = 0; i < j; i++) {
					
					// reset flag before pass
					ordered = true;
					//compare current element to next highest
					if (myArray[i + 1] < myArray[i]) {
						// swap
						// hold onto element so we don't lose it
						int temp = myArray[i];
						// assign lower element
						myArray[i] = myArray[i + 1];
						// assign higher element
						myArray[i + 1] = temp;
						// a swap was made so we aren't ordered yet
						ordered = false;
					} // end if
		
				} // end for
			
			System.out.println("Pass Number " + (myArray.length - j) + " :");
			EBubbleSort.PrintArray(myArray);
			// break out of loop if we're ordered
			if (ordered) {
				break;
			}
			
		} // end outer for

	} // end main

} // end class
