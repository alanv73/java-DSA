
public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub

		System.out.println("Cat eating...");
	}

	public void meow() {
		System.out.println("Cat says... meow!");
	}

	@Override
	public void performBehavior() {
		// TODO Auto-generated method stub
		meow();
	}
}
