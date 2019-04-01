//import java.util.ArrayList;

public class ClientWOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player player1 = new Archer();
		
		player1.setHitPoints(100);
		player1.setDefensePoints(50);
		
//		((Archer)player1).setAimAbility(100);

		((Archer)player1).aim();
		((Archer)player1).attack();

		System.out.println("Archer aimAbility: " + ((Archer)player1).getAimAbility());
		
		Player player2 = new Mage();
		
		player2.attack();
		
		/*
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(new Archer());
		players.add(new Mage());
		
		players.get(0).setHitPoints(100);
		players.get(0).setDefensePoints(50);
		((Archer)players.get(0)).setAimAbility(100);
		
		Player.LaunchOffensive(players);
		*/
	}

}
