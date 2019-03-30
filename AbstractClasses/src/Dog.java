
public class Dog extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub

		System.out.println("Dog eating...");
	}
	
	public void bark() {
		System.out.println("Dog barking...");
	}

	public void retrieve() {
		System.out.println("retrieving a duck...");
	}
	
	// dog does two things (cat only does one)
	@Override
	public void performBehavior() {
		// TODO Auto-generated method stub
		bark();
		retrieve();
	}

}
