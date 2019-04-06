
public interface Mover {

	// no data members
	// private int x; // Mover is not an object! has no data members
	public static int x = 5;
	
	// any method created within an interface
	// has to be used (at least a stub) within any
	// class that uses the interface
	public void move();

	
}
