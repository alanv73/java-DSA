
public class Player {

	int number = 0;
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void guess()
	{
		number = (int) (Math.random() * 20);
//		System.out.println(name + " guessing " + number);
	}
}
