import java.util.ArrayList;

public abstract class Player {

	// data members
	private int hitPoints;
	private int defensePoints;
	
	// accessors/mutators
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	// abstract methods
	public abstract void attack();
	
	// static methods
	public static void LaunchOffensive(ArrayList<Player> players) {
		for (Player player : players) {
			if(player instanceof Archer) {
				((Archer)player).aim();
			}
			player.attack();
		}
	}
}
