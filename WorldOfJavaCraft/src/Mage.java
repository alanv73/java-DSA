
public class Mage extends Player {

	// member methods
	private int magicPoints;

	// accessors/mutators
	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		if (magicPoints >= 0 && magicPoints <= 100) {
			this.magicPoints = magicPoints;
		}
	}

	//member methods
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Mage attacking...");
		castSpell();
	}
	
	public void castSpell() {
		System.out.println("Mage casting a spell...");
	}
	
}
