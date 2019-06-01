import java.util.Arrays;

public class Queue {

	private int[] cq;
	private int insertionPoint = 0;
	private int removalPoint = 0;
	private int nElems = 0;
	private int emptySpace = -1;
	private Boolean full = false;
	private Boolean empty = true;
	
	public Queue(int size) {
		
		cq = new int[size];
		Arrays.fill(cq, -1);
	}
	
	public Boolean add(int number) {
		
		if (!full) {
			
			cq[insertionPoint] = number;
			insertionPoint++;
			nElems++;
			empty = false;
			
			if (nElems < cq.length) {
				full = false;
			}
			else {
				full = true;
			}
			
			if (insertionPoint == cq.length) {
				
				insertionPoint = 0;
			}
			
			return true;
		}
		else {
			System.out.println("array full");
			status();
			printQ();
			return false;
		}
	}
	
	public int remove() {
		
		if (!empty) {
		
			int out = cq[removalPoint];
			cq[removalPoint] = emptySpace;
			removalPoint++;
			nElems--;
			full = false;
			
			if (nElems > 0) {
				empty = false;
			}
			else {
				empty = true;
			}
			
			if(removalPoint == cq.length) {
				removalPoint = 0;
			}
			
			return out;
		}
		else {
			System.out.println("-array empty-");
			status();
			printQ();
			return -1;
		}
	}
	
	public int Length() {
		
		return nElems;
	}
	
	public Boolean isFull() {
		return full;
	}
	
	public Boolean isEmpty() {
		return empty;
	}
	
	public void printQ() {
		
		System.out.print("Array Contents: ");
		for (int i : cq) {
			
			System.out.printf("%d ", i);
		}
		
		System.out.println();
	}
	
	public void status() {
		
		System.out.printf("insertionPoint = %d\nremovalPoint = %d\n", insertionPoint, removalPoint);
		System.out.printf("isEmpty: %s\nisFull: %s\n", empty, full);
	}
}
