
public class Person {

//	Person leftPerson = null;
	Person nextPerson; // link to next
	String name;
	
	public Person(String name) {
		this.name = name;
		this.nextPerson = null;
	}
	
	public void displayPerson() {
		System.out.println("Person:\t- " + this.name);
		if (this.nextPerson != null) {
			System.out.println("\t- nextPerson: " + this.nextPerson.name);
		}
		else {
			System.out.println("\t- nextPerson: " + this.nextPerson);
		}
		System.out.println();
	}
	
}
