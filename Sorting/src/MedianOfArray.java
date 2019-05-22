
public class MedianOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,23,9,15,4,27,3,47,12,5,16,2};
		
		System.out.println("starting array...");
		PrintArray(myArray);
		
		insertionSort(myArray);
		
		System.out.println("sorted array...");
		PrintArray(myArray);
		
		System.out.printf("\nmedian = %.1f\n", median(myArray));
	}

	private static float median(int[] array) {
		
		int length = array.length;
		
		if ((length % 2) != 0) {
			
			return array[length / 2];
		}
		
		return (array[(length - 1) / 2] + array[length / 2]) / 2.0f;
		
	}
	
	private static void insertionSort(int[] myArray) {
		
		for (int j = 0; j < myArray.length - 1; j++) {
			
			int lowest = myArray[j];
			int lowestIndex = j;
			
			for (int i = j + 1; i < myArray.length; i++) {
				
				if (myArray[i] < lowest) {
					lowest = myArray[i];
					lowestIndex = i;
				}
			} // end i
			
			
			if (j != lowestIndex) {

				for (int k = lowestIndex; k > j; k--) {
					
					myArray[k] = myArray[k - 1];
				} // end k

				myArray[j] = lowest;
			}
			
		} // end j
	}

	public static void PrintArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
