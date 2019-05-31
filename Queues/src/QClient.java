
public class QClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue myQ = new Queue(10);
		
		myQ.printQ();
		
		for (int o = 0; o < 4; o++) {
		
			System.out.println(o + " inserting...");
			for (int i = 0; i < 5; i++) {
				
				myQ.add(i);
			}
			
			myQ.printQ();
			
			System.out.println(o + "removing...");
			for (int i = 0; i < 3; i++) {
				
				myQ.remove();
			}
	
			myQ.printQ();

		}
	}

}
