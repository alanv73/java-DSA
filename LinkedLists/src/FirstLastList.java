
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
		if (firstPerson != null) {
			// if we are at the end
			if(firstPerson.nextPerson == null) {
				lastPerson = null;
			}
			
			firstPerson = firstPerson.nextPerson;
		}
	}

	// delete from end
	public void deleteBottom() {
		// if the First Last List is not empty
		if (firstPerson != null) {
			// if we are at the end (there is only one)
			if(firstPerson.nextPerson == null) {
				firstPerson = null;
			} // if (firstPerson.nextPerson == null) 
			else { // not at the end
				Person currentPerson = firstPerson;
				
				// until we hit the *next to last* person
				while (currentPerson.nextPerson != lastPerson) { 
					
					currentPerson = currentPerson.nextPerson;
				} // while (currentPerson.nextPerson != lastPerson) 
				
				// currentPerson is now the *next to last* person
				// set currentPerson to lastPerson by setting nextPerson
				// to null and setting lastPerson of List to currentPerson
				currentPerson.nextPerson = null;
				this.lastPerson = currentPerson;
			} // else
		} // outer if (firstPerson != null)
	} // deleteBottom method

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
