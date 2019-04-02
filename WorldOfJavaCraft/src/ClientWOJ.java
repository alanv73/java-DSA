
public class ClientWOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player1 = new Archer(80);
		
		player1.setHitPoints(100);
		player1.setDefensePoints(50);

		System.out.println("Archer:\n" + player1.toString());
		
		((Archer)player1).aim();
		((Archer)player1).attack();
		
		Player player2 = new Mage(75);

		System.out.println("Mage:\n" + player2.toString());

		player2.attack();
	}

}
