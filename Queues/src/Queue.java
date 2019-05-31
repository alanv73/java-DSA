import java.util.Arrays;

public class Queue {

	int[] cq;
	int insertionPoint = 0;
	int removalPoint = 0;
	int emptySpace = -1;
	
	public Queue(int size) {
		
		cq = new int[size];
		Arrays.fill(cq, -1);
	}
	
	public void add(int number) {
		
		if (cq[insertionPoint] == -1) {
			
			cq[insertionPoint] = number;
			insertionPoint++;
			
			if (insertionPoint == cq.length) {
				
				insertionPoint = 0;
			}
		}
		else {
			System.out.println("array full");
		}
	}
	
	public int remove() {
		
		if (cq[removalPoint] != -1) {
		
			int out = cq[removalPoint];
			cq[removalPoint] = emptySpace;
			removalPoint++;
			
			if(removalPoint > cq.length) {
				removalPoint = 0;
			}
			
			return out;
		}
		else {
			System.out.println("array empty");
			return -1;
		}
	}
	
	public void printQ() {
		
		for (int i : cq) {
			
			System.out.printf("%d ", i);
		}
		
		System.out.println();
	}
	
	public void status() {
		
		System.out.printf("insertionPoint = %d\nremovalPoint = %d\n", insertionPoint, removalPoint);
	}
}
