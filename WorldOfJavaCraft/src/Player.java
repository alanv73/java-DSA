
public abstract class Player implements Attacker {

	// data members
	private int hitPoints;
	private int defensePoints;
	private int attackPower;
	
	// constructors
	public Player(int hitPoints, int defensePoints) {
		this.hitPoints = hitPoints;
		this.defensePoints = defensePoints;
	}
	
	// accessors/mutators
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	// member methods
	public String toString() {
		return "hitPoints: " + this.hitPoints + 
				"\ndefensePoints: " + this.defensePoints;
	}
	
}
