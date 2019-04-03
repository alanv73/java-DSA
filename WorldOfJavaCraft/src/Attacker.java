
public interface Attacker {

	void setAttackPower(int attackPower);
	int getAttackPower();
	
	default public void attack() {
		System.out.println("attacking with attack power " + getAttackPower() + "...");
	}
}
