
public class Client_FirstLastListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstLastList fll = new FirstLastList();
		
		fll.deleteTop();
		fll.insertFirst(new Person("Ringo"));
		fll.insertFirst(new Person("George"));
		fll.insertFirst(new Person("Paul"));
		fll.insertFirst(new Person("John"));
		fll.insertFirst(new Person("Carlos"));

		fll.insertLast(new Person("Fred"));
		fll.insertLast(new Person("Sally"));
		fll.insertLast(new Person("Joe"));
		fll.insertLast(new Person("Mark"));
		fll.insertLast(new Person("Todd"));
		
		fll.displayFirstLastList();
		
		fll.deleteTop();
		
		System.out.println("-- after deleting Top person --\n");
		
		fll.displayFirstLastList();
		
		fll.deleteBottom();
		fll.deleteBottom();
		fll.deleteBottom();
		fll.deleteBottom();
		fll.deleteBottom();
		System.out.println("-- after deleting 5 Bottom people --\n");
		
		fll.displayFirstLastList();
	}

}
