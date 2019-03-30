
public class ClientWOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player1 = new Archer();
		
		player1.setHitPoints(100);
		player1.setDefensePoints(50);
		((Archer)player1).setAimAbility(80);
		((Archer)player1).aim();
		((Archer)player1).attack();
		System.out.println("Archer aimAbility: " + ((Archer)player1).getAimAbility());
		
		Player player2 = new Mage();
		
		player2.attack();
	}

}
