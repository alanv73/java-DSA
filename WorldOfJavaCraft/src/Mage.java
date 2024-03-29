
public class Mage extends Player {

	// member methods
	private int magicPoints;

	// constructor
	public Mage(int hitPoints, int defensePoints, int magicPoints) {
		super(hitPoints, defensePoints);
		setMagicPoints(magicPoints);
	}
	
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
		castSpell();
		super.attack();
	}
	
	public void castSpell() {
		System.out.println("Mage casting a spell...");
	}
	
	public String toString() {
		return "Mage:\n" + 
				"magicPoints: " + this.magicPoints + "\n" +
				super.toString();
	}
	
}
