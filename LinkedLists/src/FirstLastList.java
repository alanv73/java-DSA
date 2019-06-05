
public class FirstLastList {

	// "Link" in textbook pg 198/223
	Person firstPerson;
	Person lastPerson;

	public FirstLastList() {
		firstPerson = null;
		lastPerson = null;
	}

	// check for empty list; this will help us determine
	// where to insert new elements
	public Boolean listIsEmpty() {
		return firstPerson == null;
	}

	// Two methods for insertion -
	// one at beginning, one at the end
	public void insertFirst(Person p) {
		Person newPerson = new Person(p.name);

		if (listIsEmpty()) {
			lastPerson = newPerson;
		}

		newPerson.nextPerson = firstPerson;
		firstPerson = newPerson;
	}

	public void insertLast(Person p) {
		Person newPerson = new Person(p.name);

		if (listIsEmpty()) {
			// set first person
			firstPerson = newPerson;
		} 
		else {
			// append
			lastPerson.nextPerson = newPerson;
		}

		lastPerson = newPerson;

	}
	
	// delete from beginning
	public void deleteTop() {
	// if we are at the end
		if(firstPerson.nextPerson == null) {
			lastPerson = null;
		}
		
		firstPerson = firstPerson.nextPerson;
	}

	// delete from end
	public void deleteBottom() {
	// if we are at the end
		if(firstPerson.nextPerson == null) {
			firstPerson = null;
		}
		else {
			Person currentPerson = firstPerson;
			
			while (currentPerson.nextPerson != lastPerson) {
				
				currentPerson = currentPerson.nextPerson;
			}
			
			currentPerson.nextPerson = null;
			lastPerson = currentPerson;
		}
		
	}

	public void displayFirstLastList() {
		// currentPerson will change; firstPerson will not (when displaying)
		Person currentPerson = firstPerson;

		while (currentPerson != null) {
			currentPerson.displayPerson();
			// reassign
			currentPerson = currentPerson.nextPerson;
		}
	}
}
