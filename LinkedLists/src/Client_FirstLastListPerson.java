
public class Client_FirstLastListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstLastList fll = new FirstLastList();
		
		fll.insertFirst(new Person("Fred"));
		fll.insertFirst(new Person("Sally"));
		fll.insertFirst(new Person("Joe"));
		fll.insertFirst(new Person("Mark"));
		fll.insertFirst(new Person("Todd"));

//		fll.insertLast(new Person("Fred"));
//		fll.insertLast(new Person("Sally"));
//		fll.insertLast(new Person("Joe"));
//		fll.insertLast(new Person("Mark"));
//		fll.insertLast(new Person("Todd"));
		
		fll.displayFirstLastList();
		
		fll.deleteBottom();
		System.out.println("-- after deleting Bottom person --\n");
		
		fll.displayFirstLastList();
		
//		fll.deleteTop();
//		System.out.println("-- after deleting Top person --\n");
//		
//		fll.displayFirstLastList();
	}

}
