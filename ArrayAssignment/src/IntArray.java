
public class IntArray {

	public static int[] Reverse(int[] intArray) {
		
		int[] newArray = new int[intArray.length];
		int j = 0;
		
		for (int i = intArray.length - 1; i >= 0; i--) {
			if (intArray[i] != 0) {
				newArray[j] = intArray[i];
				j++;
			}
		}
		
		return newArray;
	}
	
	public static int[] Remove(int[] intArray, int value) {
		
		int newArray[] = new int[intArray.length];
		int j = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] != value) {
				newArray[j] = intArray[i];
				j++;
			}
		}
		
		return newArray;
	}
	
	public static void PrintArray(int[] Array) {
		
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
	}
}
