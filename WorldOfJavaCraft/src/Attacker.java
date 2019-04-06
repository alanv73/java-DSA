
public interface Attacker {

	
	default public void attack() {
		System.out.println("attacking...");
	}
}
