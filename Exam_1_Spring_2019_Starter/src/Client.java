
public class Client {
/*
 * Download the ‘Exam_1_Spring_2019_Starter’ project from Courseweb.
 * Then, either copy and paste the classes into a project, or do a 
 * File->Import->Existing projects into workspace.
 * 
 * Here, you will find three classes - Alien, Martian, and Kryptonian.
 * 
 * Create an interface named ‘SuperheroPowers’. In this interface, create three methods
 * declarations - one named attack() that has no parameters, and another attack(int) that
 * takes an integer named ‘attackPower’, and a third named fly(int) that takes an integer named ‘mph’.
 * 
 * Create another interface named ‘Telekinesis’ that has one method named move(obj), that
 * takes any kind of object.
 * 
 * Have the Alien class implement SuperheroPowers. In the method body for fly(), write
 * ‘flying at x mph’, and replace x with a speed.
 * 
 * Have the Martian class also implement Telekinesis; the body can contain anything you like,
 * like simply outputting that the martian is flying.
 * 
 * Implement the necessary methods into each of the classes in order to get them to compile properly.
 */
	
	public static void main(String[] args) {

		Alien al = new Alien("a",4,5,6);
		
		al.attack(5);
		al.fly(50);
		
		Martian m = new Martian("b",3,4);
		
		m.attack();
		m.attack(75);
		m.move(al);
	}

}
