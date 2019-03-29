
public abstract class Player {

	// data members
	private int hitPoints;
	private int defensePoints;
	
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

	// abstract methods
	public abstract void attack();
}
