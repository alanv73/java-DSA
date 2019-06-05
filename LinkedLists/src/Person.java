
public class Person {

//	Person leftPerson = null;
	Person nextPerson; // link to next
	String name;
	
	public Person(String name) {
		this.name = name;
		this.nextPerson = null;
	}
	
	public void displayPerson() {
		System.out.println("Person\t- memory address: " + this);
		System.out.println("\t- name: " + this.name);
		System.out.println("\t- nextPerson: " + this.nextPerson);
		if (this.nextPerson != null) {
			System.out.println("\t\t- nextPerson name: " + this.nextPerson.name);
		}
		System.out.println();
	}
	
}
