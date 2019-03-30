
public class Archer extends Player {

	// data members
	private int aimAbility;

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
	
}
