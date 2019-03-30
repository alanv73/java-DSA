
public class Mage extends Player {

	// member methods
	private byte magicPoints;

	// accessors/mutators
	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		if (magicPoints >= 0 && magicPoints <= 100) {
			this.magicPoints = (byte) magicPoints;
		}
	}

	//member methods
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		castSpell();
		System.out.println("Mage attacking...");
	}
	
	public void castSpell() {
		System.out.println("Mage casting a spell...");
	}
	
}
