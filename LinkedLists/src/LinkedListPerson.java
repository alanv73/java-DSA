
public class LinkedListPerson {

	Person firstPerson = null;
//	int numberOfLinks = 0;

	public void insertNewPerson(Person p) {
		Person newPerson = p;
		// if there are no other links, 'firstPerson' becomes null
		newPerson.nextPerson = firstPerson;
		firstPerson = newPerson;
	}
	
	public void displayLinkedList() {
		// currentPerson will change; firstPerson will not (when displaying)
		Person currentPerson = firstPerson;
		
		while (currentPerson != null) {
			currentPerson.displayPerson();
			// reassign
			currentPerson = currentPerson.nextPerson;
		}
	}
}
