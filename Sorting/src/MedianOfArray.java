
public class MedianOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int maxSize = 25;
//		int[] myArray = {6,4,9,2,7,5};
//		int[] myArray = {3,7,2,5,1,7,7,8,6,9,4,0};
		int[] myArray = {6,23,9,15,4,27,3,47,12,5,16,2};
//		int[] myArray = new int[maxSize];
//		
//		for(int j=0; j < maxSize; j++)	{				// fill first group of arrays with random numbers
//			int n = (int)( java.lang.Math.random()*(maxSize-1) );
//			myArray[j] = n;
//		}
		System.out.println("starting array...");
		PrintArray(myArray);
		
		insertionSort(myArray);
		
		System.out.println("sorted array...");
		PrintArray(myArray);
		
		System.out.printf("\nAlan's median = %.1f\n", median(myArray));
		
		getMedianChaz(myArray);
	}

	public static float median(int[] array) {
		
		if ((array.length % 2) != 0)
			return array[array.length / 2];
		
		return (array[(array.length - 1) / 2] + array[array.length / 2]) / 2.0f;
		
	}
	
	public static double getMedianChaz(int[] array) {
	
		double median = 0;
		int index = 0;
		
		// print length
		System.out.println("number of elements: " + array.length);
		
		// check for even/odd
		if (array.length / 2 % 2 == 0) {
			System.out.println("even number of elements");
			index = array.length / 2; // this will land on the element
			// that is one higher than the middle of the elements
			median = (array[index] + array[index - 1]) / 2.0d;
		}
		else {
			System.out.println("odd number of elements");
			median = array[index];
		}
		

		System.out.println("Chaz's median: " + median);
		
		return median;
	}
	
	public static void insertionSort(int[] myArray) {
		
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
