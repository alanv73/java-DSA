
public class ArrayClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myNumbers = new int[10];
		int[] myEmptyArray = new int[10];
		
		myNumbers[0] = 1;
		myNumbers[1] = 2;
		myNumbers[2] = 3;
		myNumbers[3] = 4;
		myNumbers[4] = 5;

		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);

		System.out.println();
		myEmptyArray = IntArray.Reverse(myNumbers);
		
		System.out.println("Reversed Array");
		IntArray.PrintArray(myEmptyArray);
		
		System.out.println();
		int numberToRemove = 3;
		
		myEmptyArray = IntArray.Remove(myNumbers, numberToRemove);

		System.out.println("Copy of Array with " + numberToRemove + " Removed");
		IntArray.PrintArray(myEmptyArray);
	
		System.out.println();
		System.out.println("Original Array");
		IntArray.PrintArray(myNumbers);
	}

}
