
public abstract class Player implements Attacker {

	// data members
	private int hitPoints;
	private int defensePoints;
	
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
	
	// member methods
	public String toString() {
		return "hitPoints: " + this.hitPoints + "\n" + 
				"defensePoints: " + this.defensePoints;
	}
	
}
