
public class ClientWOJ {

	public static void main(String[] args) {

		// Archer constructor(hitPoints, defensePoints, aimAbility)
		Player player1 = new Archer(100, 50, 80);
		
		// change data members using mutators
		player1.setHitPoints(99);
		player1.setDefensePoints(49);
		((Archer)player1).setAimAbility(79);

		// convert to Archer to call aim() & attack() methods
		((Archer)player1).aim();
		player1.attack();
		
		// Mage constructor(hitPoints, defensePoints, magicPoints)
		Player player2 = new Mage(50, 100, 75);

		// player2 (Mage) attack() method calls castSpell() method
		player2.attack();
	}

}
