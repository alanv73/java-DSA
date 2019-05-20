
// glorified array
public class ClassDataArray {
	private Person[] myPersonArray;
	private int nElems;
							
	public ClassDataArray(int max) {
							
		myPersonArray = new Person[max];
		nElems = 0;
	}

	
	public Person findLinearSearch(String searchName) { 
	
		for (int i = 0; i < nElems; i++) {
			if (myPersonArray[i].getLast() == searchName) {
				return myPersonArray[i];
			}
		}
		return null;
	}

	// only for ordered array
	public Person findBinarySearch(String searchName) {
		
		int low = 0;
		int high = myPersonArray.length - 1; // nElems - 1;
		
		while (low <= high) {
			
			int mid = (low + high)/2;
			
			// data about current object
			if (myPersonArray[mid] != null) {
				
				System.out.println("last name of Person at index " + mid + ": " + 
						myPersonArray[mid].getLast());
			}
			else {
				
				System.out.println("Current Person is null at index " + mid);
			}
			
			
			// checking the current item and taking action
			if (myPersonArray[mid] == null) {
				
				high = mid -1;
			}
			else if (myPersonArray[mid].getLast().compareToIgnoreCase(searchName) == 0) {
			
				return myPersonArray[mid];
			}
			else if (myPersonArray[mid].getLast().compareToIgnoreCase(searchName) > 0) {
				
				high = mid - 1;
			}
			else {
				
				low = mid + 1;
			}
		} // end while
		
		return null;
		
	}
	
	public boolean insertBinaryWholeArray(String last, String first, int age) {
		
		return insertBinaryWholeArray(new Person(last, first, age));

	}

	public boolean insertBinaryWholeArray(Person person) {
		
		if (nElems < myPersonArray.length) {
			
			int low = 0;
			int high = myPersonArray.length - 1;
			int currentIndex = 0;
			String newPersonLast = person.getLast();
			String currentLast = "";
			System.out.println("person to insert is " + newPersonLast);
			System.out.print("low bound: " + low + 
					"\thigh bound: " + high);
			
			// breaks out of the while loop when the lower and
			// upper bounds cross each other
			while(low <= high) {
				
				currentIndex = (low + high)/2;

				System.out.print("\tcurrent index: " + currentIndex);

				if (myPersonArray[currentIndex]==null) {
					// do this if current index contains null
					System.out.println("\tperson at index " +
							currentIndex + " is null");
					high = currentIndex - 1;
				}
				else {
					// if current index contains a person, do the search
					currentLast = myPersonArray[currentIndex].getLast();
					System.out.println("\tperson at index " +
							currentIndex + " is " + currentLast);
					
					if (newPersonLast.compareToIgnoreCase(currentLast) < 0) {
						high = currentIndex - 1;
					}
					else {
						low = currentIndex + 1;
					}
				}
				System.out.print("low bound: " + low + 
						"\thigh bound: " + high);
			} // end while (low <= high)
			
			// one last check to see if the new person goes here or one space above
			if (myPersonArray[currentIndex]!=null) {

				if (newPersonLast.compareToIgnoreCase(currentLast) > 0) {
					currentIndex++;
				}
			}
			
			// shift all people at or above the target location up one space
			for (int i = myPersonArray.length - 1; i > currentIndex; i--) {
				myPersonArray[i] = myPersonArray[i - 1];
			}
			
			// insert the person
			myPersonArray[currentIndex] = person;
			System.out.println("\tinserting -->" + newPersonLast + "<-- at index " + currentIndex);
			System.out.println();
			nElems++;
			
			return true;
			
		} // end if (nElems < array.length)
		
		return false;
	}
	
	public boolean insertBinary(String last, String first, int age) {
		
		return insertBinary(new Person(last, first, age));

	}

	public boolean insertBinary(Person person) {
		
		if (nElems < myPersonArray.length) {
			
			int low = 0;
			int high = nElems - 1;
			int currentIndex = 0;
			String newPersonLast = person.getLast();
			String currentLast = "";
			System.out.println("Begin - Number of People in Array is " + nElems);
			System.out.println("person to insert is " + newPersonLast);
			System.out.print("low bound: " + low + 
					"\thigh bound: " + high);
			
			if (nElems == 0) {
				System.out.println("\tinserting -->" + newPersonLast + "<-- at index " + currentIndex);

				myPersonArray[0] = person;
				nElems++;
				System.out.println();
				return true;
			} // end if (nElems == 0)
			else {
				// breaks out of the while loop when the lower and
				// upper bounds cross each other
				while(low <= high) {
					
					currentIndex = (low + high)/2;
	
					System.out.print("\tcurrent index: " + currentIndex);
	
					currentLast = myPersonArray[currentIndex].getLast();
					System.out.println("\tperson at index " +
							currentIndex + " is " + currentLast);
					
					if (newPersonLast.compareToIgnoreCase(currentLast) < 0) {
						high = currentIndex - 1;
					}
					else {
						low = currentIndex + 1;
					}
					
					System.out.print("low bound: " + low + 
							"\thigh bound: " + high);
				} // end while (low <= high)
			
				// one last check to see if the new person goes here or one space above
				if (newPersonLast.compareToIgnoreCase(currentLast) > 0) {
					currentIndex++;
				}
				
				// shift all people at or above the target location up one space
				for (int i = nElems; i > currentIndex; i--) {
					myPersonArray[i] = myPersonArray[i - 1];
				}
				
				// insert the person
				myPersonArray[currentIndex] = person;
				System.out.println("\tinserting -->" + newPersonLast + "<-- at index " + currentIndex);
				nElems++;
				System.out.println();
			} // end else if (nElems != 0)
			
			return true;
			
		} // end if (nElems < array.length)
		
		return false;
	}

	public boolean insertOld(String last, String first, int age) {
		
		return insertOld(new Person(last, first, age));

	}

	// overload (not in book)
	public boolean insertOld(Person person) {
		
		String last = person.getLast();

		if (nElems == myPersonArray.length) {
			System.out.println("Array Full.. " + last + " not inserted");
			return false;
		}
		else if (nElems == 0) {
			myPersonArray[0] = person;
			nElems++; // increment size
			return true; // success
		}
		
		int low = 0;
		int high = nElems - 1;
		int mid = 0;
		
		while(low <= high) {
			
			mid = (low + high)/2;
			
			if (last.compareToIgnoreCase(myPersonArray[mid].getLast()) == 0) {
				return false;
			}
			else if (low == high) {
				break;
			}
			else if (last.compareToIgnoreCase(myPersonArray[mid].getLast()) < 0) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		int targetIndex = 0;
		
		if (last.compareToIgnoreCase(myPersonArray[low].getLast()) < 0) {
			
			targetIndex = low;
		}
		else {
			targetIndex = low + 1;
		}
		
		int i;
		for (i = nElems - 1; i >= targetIndex; i--) {
			
			myPersonArray[i + 1] = myPersonArray[i];
		}
		
		myPersonArray[i + 1] = person;
		nElems++; // increment size
		return true;
	}

	public boolean insertBinaryChaz(String last, String first, int age) {
		
		return insertBinaryChaz(new Person(last, first, age));

	}
	
	public boolean insertBinaryChaz(Person tempPerson) {
		
		//timesInsertBinary3Called++;
		System.out.println("\nCALLING insertBinary3() ");
		System.out.println("\nTrying to insert " + tempPerson.getLast());
		//System.out.println("-times: " + timesInsertBinary3Called);

		//Person tempPerson = new Person(last, first, age);
		
		boolean success = false;
		
		// Find the spot to insert
		
		// Keep track of where we are
		int currentIndex;

		// On the first pass, set the lower end of the range
		// to 0, and upper range to last element
		int lowerBounds = 0;
		int upperBounds = nElems - 1;
		
		int numberOfPasses = 0;
		
		
		while(success == false) {
		//while(numberOfPasses < 8 && lowerBounds <= upperBounds) {
		//while(numberOfPasses < 4) {
		//if(numberOfPasses == 0) {
			
			numberOfPasses++;  // probably not necessary with insert???
			
			currentIndex = (lowerBounds + upperBounds) / 2;
			
			System.out.println("numberOfPasses: " + numberOfPasses);
			
			
			System.out.println("--upperBounds is now " + upperBounds);
			System.out.println("--lowerBounds is now " + lowerBounds);
			System.out.println("--nElems is now " + nElems);
			System.out.println("--currentIndex is now " + currentIndex);
			
			// if the new person is greater than the element before it,
			// and less than the element after it, insert. And shift.
			// Check for nulls as well.
			
			// First case - if array is empty, insert
			if(nElems == 0) {
				myPersonArray[0] = tempPerson;
				nElems++;
				upperBounds = 0;  // manip
				System.out.println("Start - Inserting Person at index 0 ( " + tempPerson.getLast() + ")");
				success = true;
				return true;  // don't forget!
			}
			
			else {  // there is at least 1 element in the array

				if(myPersonArray[currentIndex].getLast().compareTo(tempPerson.getLast()) < 0) {
					System.out.println("tempPerson " + tempPerson.getLast() + " is greater than currentIndex ("+myPersonArray[currentIndex].getLast()+")");
					
					// and if person above is null, insert
					if(myPersonArray[currentIndex + 1] == null) {
						System.out.println("IF - null");
						// insert
						System.out.println("person above is null");
						success = true;
						myPersonArray[currentIndex + 1] = tempPerson;
						nElems++;
					}
					else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0) {
						System.out.println("person above is greater; inserting new person at current index");
						success = true;
						
						for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
							// assign higher spot with
							myPersonArray[i] = myPersonArray[i - 1];
							
						}
						myPersonArray[currentIndex + 1] = tempPerson;
						System.out.println("myPersonArray[currentIndex]:  " + myPersonArray[currentIndex].getLast());
						nElems++;
						System.out.println("ELSE IF ending ");
						
					}
					else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) > 0) {
						lowerBounds = currentIndex + 1;
						
						System.out.print(" and tempPerson( " + tempPerson.getLast() +
								") is greater than myPersonArray[currentIndex + 1], which is " +
								myPersonArray[currentIndex + 1].getLast() + "; moving lowerBounds up to " + lowerBounds);
						System.out.print("\n");
						
					}
					
				}  // if the person we are trying to insert is less than what is at
				// the current index
				else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0) {
					
					System.out.println("tempPerson " + tempPerson.getLast() + " is less than currentIndex (" +
							myPersonArray[currentIndex].getLast()+")");
					System.out.println("currentIndex: " + currentIndex);

					if(nElems > 0) {
						
						if(myPersonArray[currentIndex + 1] == null) {
							// insert
							System.out.println("-person above is null");
							
							if(tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) < 0) {
								success = true;
								for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
									// assign higher spot:
									myPersonArray[i] = myPersonArray[i - 1];
									
								}
								myPersonArray[currentIndex] = tempPerson;
								nElems++;
							}
							
						}
						else if(tempPerson.getLast().compareTo(myPersonArray[currentIndex + 1].getLast()) < 0
								&& tempPerson.getLast().compareTo(myPersonArray[currentIndex].getLast()) > 0){
							System.out.println("tempPerson " + tempPerson.getLast() + " is less than currentIndex + 1 (" +
									myPersonArray[currentIndex + 1].getLast() +"),"
											+ " and tempPerson " + tempPerson.getLast() + 
											" is greater than currentIndex (" + myPersonArray[currentIndex].getLast() + ") ");
							
							success = true;
							for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
								// assign higher spot with
								myPersonArray[i] = myPersonArray[i - 1];
								
							}
							myPersonArray[currentIndex] = tempPerson;
							nElems++;
							
						}
						// if the person we are trying to insert is less than all other elements
						else if (currentIndex == 0) {
							System.out.println("ELSE");
							// upperBounds = currentIndex - 1;
							System.out.print(" and tempPerson( " + tempPerson.getLast() +
									") is .. than myPersonArray[currentIndex + 1], which is " +
									myPersonArray[currentIndex + 1].getLast() + "; moving upperBounds down to " + lowerBounds);
							System.out.print("\n");
							
							success = true;
							for(int i = myPersonArray.length - 1; i > currentIndex; i--) {
								// assign higher spot with
								myPersonArray[i] = myPersonArray[i - 1];
								
							}
							myPersonArray[currentIndex] = tempPerson;
							nElems++;
							
						}
						
					}
					
					upperBounds = currentIndex - 1;
				}

			}
		
		}
		return success;
				
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
		}
		// reduce the number of elements by 1
		nElems--;
		return true;
	}

	public void insertUnordered(String last, String first, int age) {
		
		insertUnordered(new Person(last, first, age));

	}

	public void insertUnordered (Person person) {
		
		myPersonArray[nElems] = person;
		nElems++;
		
	}

	public void bubbleSort () {
		
		String lname1;
		String lname2;
		
		System.out.println("\nBubble Sort...\n");

		for (int i = nElems; i > 0; i--) {
			boolean sorted = true;
		
			for (int j = 1; j < i; j++) {
				
				lname1 = myPersonArray[j - 1].getLast();
				lname2 = myPersonArray[j].getLast();
				if (lname2.compareTo(lname1) < 0) {
					swap(j, j - 1);
					sorted = false;
				} // if
				
			} // inner
			if (sorted) {
				
				break;
			}
		} // outer
	} // method
	
	public void selectionSort() {
		
		System.out.println("\nSelection Sort...\n");

		for (int i = 0; i < nElems - 1;i++) {
			
			String lowLname = myPersonArray[i].getLast();
			int lowIndex = i;
			
			for (int j = i + 1; j < nElems; j++) {
				
				String currentLname = myPersonArray[j].getLast();
				if (currentLname.compareTo(lowLname) < 0) {
					lowLname = currentLname;
					lowIndex = j;
				}
				
			} // inner
			
			if (lowIndex != i) {
				swap(i, lowIndex);
			}
			
		} // outer
	}
	
	public void insertionSort() {
		
		System.out.println("\nInsertion Sort...\n");
		
		for (int i = 1; i < nElems; i++) {
			
			int j = i;
			String currentLname = myPersonArray[i].getLast();
			while (j > 0 && myPersonArray[j - 1].getLast().compareTo(currentLname) > 0) {
				
				swap(j, j - 1);
				j--;
			}
		}
	}
	
	private void swap(int element1, int element2) {
	
		Person temp = myPersonArray[element1];
		myPersonArray[element1] = myPersonArray[element2];
		myPersonArray[element2] = temp;
		
	}
	
	public void displayA() {
		
		System.out.println("Array Contents:");
		for (int i = 0; i < nElems; i++) {
		
				myPersonArray[i].displayPerson();
		}
	}
}
