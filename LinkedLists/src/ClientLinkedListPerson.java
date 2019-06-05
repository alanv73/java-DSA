
public class ClientLinkedListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListPerson llp = new LinkedListPerson();
		llp.insertNewPerson(new Person("Fred"));
		llp.insertNewPerson(new Person("Sally"));
		llp.insertNewPerson(new Person("Joe"));
		llp.insertNewPerson(new Person("Mark"));
		llp.insertNewPerson(new Person("Todd"));

		llp.displayLinkedList();
	}

}
