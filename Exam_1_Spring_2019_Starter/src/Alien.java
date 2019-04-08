public class Alien implements SuperheroPowers
{
	private String name;
	private int height;
	private int health;
	private int damage;
   
	public Alien(String name, int height, int health, int damage)
	{
		this.name = name;
		this.height = height;
		this.health = health;
		this.damage = damage;
      
	}
	
	public void setHealth(int num)
	{
		this.health = num;
	}
	public void ToString()
	{
		System.out.println(name + ": is " + height +
				" tall and has: " + health + " health");
	}
	
	public void fly(int mph) {
		System.out.println("flying at " + mph + " mph");
	}
	
	public void attack() {
		System.out.println("attacking");
	}
	
	public void attack(int attackPower) {
		System.out.println("attacking with " + attackPower + " attackPower");
	}

}