import java.util.ArrayList;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> letters = new ArrayList<Integer>();
		
		letters.add(1);
		letters.add(2);
		letters.add(3);
		int letter = 4;
		
		if (letters.contains(letter)) {
			System.out.println("contains 4");
		} else {
			System.out.println("does not contain 4");
		}
		
	}

}
