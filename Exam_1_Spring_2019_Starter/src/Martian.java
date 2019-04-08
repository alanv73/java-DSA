public class Martian extends Alien implements Telekinesis
{
	public static final int BASE_ATTACK_POWER = 88;
	
	private String name;
	private int height;
	private int health;
	private int attackPower;
   
	public Martian(String name, int height, int health)
	{
		super(name, height, health, BASE_ATTACK_POWER);
		this.name = name;
		this.height = height;
		this.health = health;
		this.attackPower = BASE_ATTACK_POWER;
	}	
	
	public void ToString()
	{
		System.out.println(name + ": is " + height +
				" inches tall and has: " + health+ " health");
	}
	
	public void move(Object obj) {
		System.out.println("moving object " + obj);
	}
	

}