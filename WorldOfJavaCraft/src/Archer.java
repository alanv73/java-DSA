
public class Archer extends Player {

	// data members
	private int aimAbility;
	
	// constructor
	public Archer(int aimAbility) {
		setAimAbility(aimAbility);
		// same as this.setAimAbility(aimAbility);
	}
	
	
	// accessors/mutators
	public int getAimAbility() {
		return aimAbility;
	}

	public void setAimAbility(int aimAbility) {
		if (aimAbility >= 0 && aimAbility <= 100) {
			this.aimAbility = aimAbility;
		} else {
			// leave at 0? or assign default value?
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
