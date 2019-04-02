
public class ClientWOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ( hitPoints, defensePoints, aimAbility )
		Player player1 = new Archer(100, 50, 80);
		
		player1.setHitPoints(99);
		player1.setDefensePoints(49);

		System.out.println("Archer:\n" + player1.toString());
		
		((Archer)player1).aim();
		((Archer)player1).attack();
		
		// ( hitPoints, defensePoints, aimAbility )
		Player player2 = new Mage(50, 100, 75);

		System.out.println("Mage:\n" + player2.toString());

		player2.attack();
	}

}
