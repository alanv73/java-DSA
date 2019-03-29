
public class Archer extends Player {

	// data members
	private byte aimAbility;

	// accessors/mutators
	
	public byte getAimAbility() {
		return aimAbility;
	}

	public void setAimAbility(byte aimAbility) {
		this.aimAbility = aimAbility;
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
