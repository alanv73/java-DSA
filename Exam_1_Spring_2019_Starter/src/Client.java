
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alien al = new Alien("a",4,5,6);
		
		al.attack(5);
		al.fly(50);
		
		Martian m = new Martian("b",3,4);
		
		m.move(al);
	}

}
