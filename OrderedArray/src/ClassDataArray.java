
// glorified array
public class ClassDataArray {
	private Person[] myPersonArray;
	private int nElems;
							
	public ClassDataArray(int max) {
							
		myPersonArray = new Person[max];
		nElems = 0;
	}

	
	public Person find(String searchName) { 
	
		return null;
	}


	public void insert(String last, String first, int age) {
		
		myPersonArray[nElems] = new Person(last, first, age);
		nElems++; // increment size 
	}
	
	// overload (not in book)
	public void insert(Person person) {
		
		myPersonArray[nElems] = person;
		nElems++; // increment size
	}


	public boolean delete(String searchName) {

		int j = 0; // init outside loop to access after loop ends
		
		for(; j < nElems; j++) { // omitting loop control variable initialization
			
			if(myPersonArray[j].getLast().equals(searchName)) {
				break; // this retains the value of j after loop is broken
			}
		}
		
		// if we haven't found the item j will be
		// equal to the number of elements in the array
		if (j == nElems) {
			return false; // we didn't find it
		}
		
		// now remove found element and shift upper 
		// elements down (no delete is really done
		// the element is just overwritten)
		
		//
		for(int k = j; k < nElems; k++) {
			// shift down
			if (k + 1 < nElems) {
				myPersonArray[k] = myPersonArray[k +1];
			}
			else {
				myPersonArray[k] = null;
			}
			// reduce the number of elements by 1
			nElems--;
		}
		return true;
	}

}
