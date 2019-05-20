
public class ArrayClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myNumbers = new int[5];
		int[] myEmptyArray;
		
		myNumbers[0] = 2;
		myNumbers[1] = 4;
		myNumbers[2] = 6;
		myNumbers[3] = 8;
		myNumbers[4] = 10;

		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);

		System.out.println();
		myEmptyArray = IntArray.Reverse(myNumbers);
		
		System.out.println("Reversed Array");
		IntArray.PrintArray(myEmptyArray);
		
		System.out.println();
		int numberToRemove = 6;
		
		myEmptyArray = IntArray.Remove(myNumbers, numberToRemove);

		System.out.println("Copy of Array with " + numberToRemove + " Removed");
		IntArray.PrintArray(myEmptyArray);
	
		System.out.println();
		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);
	}

}
