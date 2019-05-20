
public class SelectionSort {

	public static void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,4,9,3,7,5};
		int low = myArray[0];
		
		// loop through, compare first element to all elements
		// swap with the lowest element
		for (int i = 0; i < myArray.length - 1; i++) {
			
			for (int j = i; j < myArray.length - 1; j++) {
				
				// if the next value in the array is lower than the current lowest number,
				// then set low to be that array value
				if (myArray[j] < low) {
					
					low = myArray[j];
					myArray[i] = low;
					int temp = myArray[i];
					myArray[j] = temp;
					System.out.println("new low value: " + low);
				} // if
			} // inner
			PrintArray(myArray);
		} // outer
	}

}
