
public class Mage extends Player {

	// member methods
	private byte magicPoints;

	// accessors/mutators
	public byte getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(byte magicPoints) {
		this.magicPoints = magicPoints;
	}

	//member methods
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Mage attacking...");
	}
	
	public void castSpell() {
		System.out.println("Mage casting a spell...");
	}
	
}
