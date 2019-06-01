
public class QClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue myQ = new Queue(10);
		int numberOfAdditions = 7;
		int numberOfRemovals = 4;
		
		myQ.printQ();
		
		for (int o = 0; o < 5; o++) {
		
			for (int i = 0; i < numberOfAdditions; i++) {
				
				
				if (!myQ.isFull()) {
					
					System.out.printf("%d.%d inserting %d... ", o, i, i);
					myQ.add(i);
					System.out.println("success!");
				}
				else {
					System.out.println("full queue... no more insertions");
				}
			}

			System.out.println("\nAfter insertions...");
			myQ.printQ();
			System.out.println();
			
			for (int i = 0; i < numberOfRemovals; i++) {
				
				if (!myQ.isEmpty()) {
				
					System.out.printf("%d.%d removing ", o, i);
					int delete = myQ.remove();
					System.out.printf("%s... success!\n", delete );
				}
				else {
					System.out.println("empty queue... no more removals");
				}
			}
	
			System.out.println("\nAfter removals...");
			myQ.printQ();
			System.out.println();

		}

	}

}
