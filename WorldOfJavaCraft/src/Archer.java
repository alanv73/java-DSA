
public class Archer extends Player {

	// data members
	private int aimAbility;
	
	// constructor
	public Archer(int hitPoints, int defensePoints, int aimAbility) {
		super(hitPoints, defensePoints);
		setAimAbility(aimAbility);
	}
	
	
	// accessors/mutators
	public int getAimAbility() {
		return aimAbility;
	}

	public void setAimAbility(int aimAbility) {
		if (aimAbility >= 0 && aimAbility <= 100) {
			this.aimAbility = aimAbility;
		}
	}

	// member methods
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Archer attacking...");
	}
	
	public void aim() {
		System.out.println("Archer focusing...");
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"aimAbility: " + this.aimAbility;
	}
	
}
