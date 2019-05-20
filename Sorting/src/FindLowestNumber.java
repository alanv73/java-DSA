
public class FindLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,4,9,3,7,5};
		
		// assuming all positive numbers in an array
		int low = myArray[0];
		
		for (int i: myArray) {
			// if the next value in the array is lower than the current
			// lowest number, then set low to be that array value
			if (i < low) {
				low = i;
				System.out.println("new low value: " + low);
			}
		}
		System.out.println("lowest value: " + low);
	}

}
